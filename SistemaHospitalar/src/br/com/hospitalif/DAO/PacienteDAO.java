package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Paciente;

public class PacienteDAO {
	public void save(Paciente p) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		
		String sqlPaciente = "INSERT INTO paciente (doenca, historico) VALUES(?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlPaciente);
		stmt.setString(1, p.getDoenca());
		stmt.setString(2, p.getHistorico());
		stmt.execute();
	}
}
