package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Medico;

public class MedicoDAO {
	
	public void save(Medico m) throws SQLException {
		Conexao con = new Conexao();
		Connection conexao = con.getConnection();	
		System.out.println(con.getStatus());
		
		String sqlINSERE = "INSERT INTO medico values(?, ?, ?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlINSERE);
		stmt.setInt(1, 2);
		stmt.setInt(2, m.getNumeroderegistro());
		stmt.setString(3, m.getEspecialidade());
		stmt.setInt(4, 2);
		stmt.execute();
	}
	
	public void removeById(int id) throws SQLException{
		Conexao con = new Conexao();
		Connection conexao = con.getConnection();	
		System.out.println(con.getStatus());
		
		String sqlINSERE = "DELETE from medico where id = (?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlINSERE);
		stmt.setInt(1, id);
		stmt.execute();
	}

}
