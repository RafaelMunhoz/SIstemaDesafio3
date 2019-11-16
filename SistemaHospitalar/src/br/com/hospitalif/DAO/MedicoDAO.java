package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Funcionario;
import br.com.hospitalif.model.Medico;
import br.com.hospitalif.model.Pessoa;

public class MedicoDAO {
	public void save(Pessoa p, Funcionario f, Medico m) throws SQLException {

		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();

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

		sqlPessoa = "select idPessoa from pessoa where cpf = " + p.getCpf();
		stmtPessoa = conexao.prepareStatement(sqlPessoa);
		ResultSet rs = stmtPessoa.executeQuery(sqlPessoa);
		if (rs.next()) {
			p.setIdPessoa(rs.getInt(1));
		}
		stmtPessoa.close();

		String sqlFuncionario = "INSERT INTO funcionario (login, senha, statusDeUsuario, idPessoa)"
				+ " VALUES(?,?,?,?)";
		PreparedStatement stmtFuncionario = conexao.prepareStatement(sqlFuncionario);
		stmtFuncionario.setString(1, f.getLogin());
		stmtFuncionario.setString(2, f.getSenha());
		stmtFuncionario.setString(3, f.getStatusDeUsuario());
		stmtFuncionario.setInt(4, p.getIdPessoa());
		stmtFuncionario.execute();

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

	public List<Medico> select() {
		List<Medico> ListaMedicos = new ArrayList<Medico>();
		try {
			Conexao conn = new Conexao();
			Connection conexao = conn.getConnection();

			String sqlPessoa = "SELECT * FROM pessoa";
			PreparedStatement stmtPessoa = conexao.prepareStatement(sqlPessoa);
			ResultSet rsPessoa = stmtPessoa.executeQuery();

			String sqlFuncionario = "SELECT * FROM funcionario";
			PreparedStatement stmtFuncionario = conexao.prepareStatement(sqlFuncionario);
			ResultSet rsFuncionario = stmtFuncionario.executeQuery();

			String sqlMedico = "SELECT * FROM medico";
			PreparedStatement stmtMedico = conexao.prepareStatement(sqlMedico);
			ResultSet rsMedico = stmtMedico.executeQuery();

			while (rsMedico.next() && rsPessoa.next() && rsFuncionario.next()) {
				Medico m1 = new Medico();
				m1.setNome(rsPessoa.getString("nome"));
				m1.setCpf(rsPessoa.getString("cpf"));
				m1.setIdade(rsPessoa.getInt("idade"));
				m1.setTipoSanguineo(rsPessoa.getString("tipoSanguineo"));
				m1.setSexo(rsPessoa.getString("sexo"));
				m1.setStatusDaPessoa(rsPessoa.getString("statusPessoa"));
				m1.setLogin(rsFuncionario.getString("login"));
				m1.setSenha(rsFuncionario.getString("senha"));
				m1.setStatusDeUsuario(rsFuncionario.getString("statusDeUsuario"));
				m1.setNumeroderegistro(rsMedico.getInt("numeroRegistro"));
				m1.setEspecialidade(rsMedico.getString("especialidade"));
				ListaMedicos.add(m1);
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return ListaMedicos;
	}

	public void salvarEdicao(Pessoa p, Funcionario f, Medico m) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();

		String sql = "select * from pessoa where cpf =" + p.getCpf();
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next()) {
			p.setIdPessoa(rs.getInt(1));
		}
		
		sql = "UPDATE pessoa SET nome = ?, cpf = ?, idade = ?, tipoSanguineo = ?, sexo = ?, statusPessoa = ? where idPessoa = ?";
		PreparedStatement stmtPessoa = conexao.prepareStatement(sql);
		stmtPessoa.setString(1, p.getNome());
		stmtPessoa.setString(2, p.getCpf());
		stmtPessoa.setInt(3, p.getIdade());
		stmtPessoa.setString(4, p.getTipoSanguineo());
		stmtPessoa.setString(5, p.getSexo());
		stmtPessoa.setString(6, p.getStatusDaPessoa());
		stmtPessoa.setInt(7, p.getIdPessoa());
		stmtPessoa.executeUpdate(sql);

		sql = "select * from funcionario where idPessoa =" + p.getIdPessoa();
		stmt = conexao.prepareStatement(sql);
		rs = stmt.executeQuery(sql);
		if (rs.next()) {
			f.setIdFuncionario(rs.getInt(1));
		}
		
		sql = "update funcionario set login = (?), senha = (?), statusDeUsuario = (?) where idFuncionario = (?)";
		stmt = conexao.prepareStatement(sql);
		stmt.setString(1, f.getLogin());
		stmt.setString(2, f.getSenha());
		stmt.setString(3, f.getSenha());
		stmt.setInt(4, f.getIdFuncionario());
		stmt.executeUpdate(sql);
		
		sql = "update medico set numeroRegistro = (?), especialidade = (?) where idFuncionario =(?)";
		stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, m.getNumeroderegistro());
		stmt.setString(2, m.getEspecialidade());
		stmt.setInt(3, f.getIdFuncionario());
		stmt.executeUpdate(sql);
		System.out.println("OOOOOOOOooooh Glóória!!!!!");
	}

	public void removeById(int id) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();

		// Consulta para buscar id de funcionario
		Funcionario f = new Funcionario();

		String sqlSELECT = "select m.idFuncionario from medico m, funcionario f " + "where m.idMedico = " + id
				+ " and f.idFuncionario";
		PreparedStatement stmt = conexao.prepareStatement(sqlSELECT);
		ResultSet rs = stmt.executeQuery(sqlSELECT);

		if (rs.next()) {
			f.setIdFuncionario(rs.getInt(1));
		}
		stmt.close();

		// Deletar registro
		String sqlDelete = "DELETE FROM medico WHERE id=(?)";
		stmt = conexao.prepareStatement(sqlDelete);
		stmt.setInt(1, id);
		stmt.execute();
	}

}