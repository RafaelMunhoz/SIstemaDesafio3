package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Entrada;

public class EntradaDAO {
	public void save(Entrada e) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		
		String sql = "INSERT INTO entrada(dataEntrada, dataSaida, statusEntrada, situacaoPaciente) "
				+ "values(?, ?, ?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setDate(1, java.sql.Date.valueOf(e.getDataEntrada()));
		stmt.setDate(2, java.sql.Date.valueOf(e.getDataSaida()));
		stmt.setString(3, (e.getStatusDeEntrada()));		
		stmt.setString(4, e.getSituacaoDePaciente());
		stmt.execute();
	}
}
