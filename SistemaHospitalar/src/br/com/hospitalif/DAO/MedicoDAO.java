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
		// Consulta para buscar id
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

		// Consulta para buscar id
		sqlFuncionario = "select idFuncionario from funcionario where idPessoa = " + p.getIdPessoa();
		stmtFuncionario = conexao.prepareStatement(sqlFuncionario);
		rs = stmtFuncionario.executeQuery(sqlFuncionario);

		if (rs.next()) {
			f.setIdFuncionario(rs.getInt(1));
		}
		stmtFuncionario.close();

		// Inserindo Medico
		String sqlMedico = "INSERT INTO medico (numeroRegistro, especialidade, idFuncionario) VALUES (?,?,?) ";
		PreparedStatement stmt = conexao.prepareStatement(sqlMedico);
		stmt.setInt(1, m.getNumeroderegistro());
		stmt.setString(2, m.getEspecialidade());
		stmt.setInt(3, f.getIdFuncionario());
		stmt.execute();
	}

	public void removeById(int id) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		
		
		//Consulta para buscar id de funcionario
		Funcionario f = new Funcionario();
		
		String sqlSELECT = "select m.idFuncionario from medico m, funcionario f "
				+ "where m.idMedico = " + id + " and f.idFuncionario";
		PreparedStatement stmt = conexao.prepareStatement(sqlSELECT);
		ResultSet rs = stmt.executeQuery(sqlSELECT);
		
		if (rs.next()) {
			f.setIdFuncionario(rs.getInt(1));
		}
		stmt.close();
		
		//Deletar registro
		String sqlDelete = "DELETE FROM medico WHERE id=(?)";
		stmt = conexao.prepareStatement(sqlDelete);
		stmt.setInt(1, id);
		stmt.execute();
	}

}