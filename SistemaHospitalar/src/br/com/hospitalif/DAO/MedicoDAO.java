package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Medico;


public class MedicoDAO {
	public void save(Medico m) throws SQLException {
		
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		
		System.out.println(conn.getStatus());
		
		String sqlInsere ="INSERT INTO medico VALUES (?,?,?, ?) ";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1, 1);
		stmt.setInt(2, m.getNumeroderegistro());
		stmt.setString(3, m.getEspecialidade());
		stmt.setInt(4, 2);
		stmt.execute();
	}
}