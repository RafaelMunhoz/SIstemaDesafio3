package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Funcionario;
import br.com.hospitalif.model.Medico;
import br.com.hospitalif.model.Pessoa;

public class MedicoDAO {
	public void save(Pessoa p, Funcionario f, Medico m) throws SQLException {

		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		
		// Inserindo Pessoa
		String sqlPessoa = "INSERT INTO pessoa (nome,cpf,idade,"
				+ "tipoSanguineo,sexo,statusPessoa) VALUES(?,?,?,?,?,?)";
		PreparedStatement stmtPessoa = conexao.prepareStatement(sqlPessoa);
		stmtPessoa.setString(1, p.getNome());
		stmtPessoa.setString(2, p.getCpf());
		stmtPessoa.setInt(3, p.getIdade());
		stmtPessoa.setString(4, p.getTipoSanguineo());
		stmtPessoa.setString(5, p.getSexo());
		stmtPessoa.setString(6, p.getStatusDaPessoa());
		stmtPessoa.execute();
		//Consulta para buscar id
		sqlPessoa = "select idPessoa from pessoa where cpf = " + p.getCpf();
		stmtPessoa = conexao.prepareStatement(sqlPessoa);
		ResultSet rs = stmtPessoa.executeQuery(sqlPessoa);
		
		if (rs.next()) {
			p.setIdPessoa(rs.getInt(1));
		}
		stmtPessoa.close();

		// Inserindo Funcionario
		String sqlFuncionario = "INSERT INTO funcionario (login, senha, statusDeUsuario, idPessoa)"
				+ " VALUES(?,?,?,?)";
		PreparedStatement stmtFuncionario = conexao.prepareStatement(sqlFuncionario);
		stmtFuncionario.setString(1, f.getLogin());
		stmtFuncionario.setString(2, f.getSenha());
		stmtFuncionario.setString(3, f.getStatusDeUsuario());
		stmtFuncionario.setInt(4, p.getIdPessoa());
		stmtFuncionario.execute();

		// Inserindo Medico
		String sqlInsere = "INSERT INTO medico (numeroRegistro, especialidade) VALUES (?,?) ";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1, m.getNumeroderegistro());
		stmt.setString(2, m.getEspecialidade());
		stmt.execute();
		
		
	}
}