package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.EnfermidadePessoal;

public class EnfermidadePessoalDAO {
	public void save(EnfermidadePessoal e) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		
		String sql = "INSERT INTO enfermidadePessoal (comentario, statusDeEnfermidade) VALUES(?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, e.getComentario());
		stmt.setString(2, e.getStatusDeEnfermidade());
		stmt.execute();
	}
}
