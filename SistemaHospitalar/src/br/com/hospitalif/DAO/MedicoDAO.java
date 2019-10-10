package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Medico;

public class MedicoDAO {
	public void save(Medico m) throws SQLException {

		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		//Print do status da conexão
		System.out.println(conn.getStatus());
		
		//Inserindo Pessoa 
		String sqlPessoa = "INSERT INTO pessoa VALUES (?,?,?,?,?,?)";
		PreparedStatement stmtPessoa = conexao.prepareStatement(sqlPessoa);
		stmtPessoa.setString(1, "Pessoa1");
		stmtPessoa.setString(2, "07739587117");
		stmtPessoa.setInt(3, 18);
		stmtPessoa.setString(4, "TipoSanguineo1");
		stmtPessoa.setString(5, "Masculino");
		stmtPessoa.setString(6, "StatusPessoa-1");
		stmtPessoa.execute();
		
		//Inserindo Funcionario 
		String sqlFuncionario = "INSERT INTO funcionario VALUES(?,?,?,?)";
		PreparedStatement stmtFuncionario = conexao.prepareStatement(sqlFuncionario);
		stmtFuncionario.setString(1, "Login1");
		stmtFuncionario.setString(2, "Senha1");
		stmtFuncionario.setString(3, "StatusFunc");
		stmtFuncionario.setInt(4, 1);
		stmtFuncionario.execute();
		
		//Inserindo Medico
		String sqlInsere = "INSERT INTO medico VALUES (?,?) ";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1, m.getNumeroderegistro());
		stmt.setString(2, m.getEspecialidade());
		stmt.execute();
	}
}