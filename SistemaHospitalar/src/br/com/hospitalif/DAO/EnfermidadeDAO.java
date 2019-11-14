package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Enfermidade;

public class EnfermidadeDAO {
	public void save(Enfermidade a) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();

		String sql = "INSERT INTO enfermidade (nome, tipo, descricao) VALUES(?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, a.getNome());
		stmt.setString(2, a.getTipo());
		stmt.setString(3, a.getDescricao());
		stmt.execute();
	}
}
