package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Atendimento;

public class AtendimentoDAO {
	public void save(Atendimento atd) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		
		// Inserindo Pessoa
				String sqlAtendimento = "INSERT INTO atendimento (comentarioEnfermeiro, comentarioMedico,"
						+ " altura, peso, data, doenca) VALUES(?,?,?,?,?,?)";
				PreparedStatement stmtAtendimento = conexao.prepareStatement(sqlAtendimento);
				stmtAtendimento.setString(1, atd.getComentarioEnfermeiro());
				stmtAtendimento.setString(2, atd.getComentarioMedico());
				stmtAtendimento.setFloat(3, atd.getAltura());
				stmtAtendimento.setFloat(4, atd.getPeso());
				stmtAtendimento.setDate(5, java.sql.Date.valueOf(atd.getData()));
				stmtAtendimento.setString(6, atd.getDoenca());
				stmtAtendimento.execute();
	}
}
