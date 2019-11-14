package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Enfermeiro;
import br.com.hospitalif.model.Funcionario;
import br.com.hospitalif.model.Pessoa;

public class EnfermeiroDAO {
	public void save(Pessoa p, Funcionario f, Enfermeiro e) throws SQLException {
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

		// Enfermeiro
		String sqlEnfermeiro = "INSERT INTO enfermeiro(numeroRegistro, idFuncionario) values(?,?)";
		PreparedStatement stmtEnfermeiro = conexao.prepareStatement(sqlEnfermeiro);
		stmtEnfermeiro.setInt(1, e.getNumeroderegistro());
		stmtEnfermeiro.setInt(2, f.getIdFuncionario());
		stmtEnfermeiro.execute();
		stmtEnfermeiro.close();
	}
	
	public List<Enfermeiro> select() {
		List<Enfermeiro> ListaEnfermeiro = new ArrayList<Enfermeiro>();
		try {
			Conexao conn = new Conexao();
			Connection conexao = conn.getConnection();
			
			String sqlPessoa = "SELECT * FROM pessoa";
			PreparedStatement stmtPessoa = conexao.prepareStatement(sqlPessoa);
			ResultSet rsPessoa = stmtPessoa.executeQuery();
			
			String sqlFuncionario = "SELECT * FROM funcionario";
			PreparedStatement stmtFuncionario = conexao.prepareStatement(sqlFuncionario);
			ResultSet rsFuncionario = stmtFuncionario.executeQuery();
			
 			String sqlEnfermeiro = "SELECT * FROM enfermeiro";
			PreparedStatement stmtEnfermeiro = conexao.prepareStatement(sqlEnfermeiro);
			ResultSet rsEnfermeiro = stmtEnfermeiro.executeQuery();
			
			while (rsEnfermeiro.next() && rsPessoa.next() && rsFuncionario.next()) {
				Enfermeiro e1 = new Enfermeiro();
				e1.setNome(rsPessoa.getString("nome"));
				e1.setCpf(rsPessoa.getString("cpf"));
				e1.setIdade(rsPessoa.getInt("idade"));
				e1.setTipoSanguineo(rsPessoa.getString("tipoSanguineo"));
				e1.setSexo(rsPessoa.getString("sexo"));
				e1.setStatusDaPessoa(rsPessoa.getString("statusPessoa"));
				e1.setLogin(rsFuncionario.getString("login"));
				e1.setSenha(rsFuncionario.getString("senha"));
				e1.setStatusDeUsuario(rsFuncionario.getString("statusDeUsuario"));
				e1.setNumeroderegistro(rsEnfermeiro.getInt("numeroRegistro"));
				ListaEnfermeiro.add(e1);
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return ListaEnfermeiro;
	}
}
