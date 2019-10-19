package br.com.hospitalif.controller;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import app.Main;
import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController extends Main {

	@FXML
	private TextField txtUsuario;

	@FXML
	private PasswordField txtSenha;

	@FXML
	private Button btnLogin;

	@FXML
	void login(ActionEvent event) throws SQLException, IOException {
		String usuario = new String(txtUsuario.getText());
		String senha = new String(txtSenha.getText());
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();

		String sql = "SELECT login, senha FROM funcionario " + "where login = '" + txtUsuario.getText()
				+ "' and senha = '" + txtSenha.getText() + "'";

		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		String user = new String();
		String pass = new String();

		while (rs.next()) {
			user = rs.getString("login");
			pass = rs.getString("senha");
		}
		if (usuario.equals("") && usuario.equals("")) {
			Alert msg = new Alert(Alert.AlertType.INFORMATION);
			msg.setHeaderText("Alerta");
			msg.setContentText("Login ou senha incorreto");
			msg.show();
		} else if (usuario.equals(user) && senha.equals(pass)) {
			openpage(Rotas.DASH);
		} else {
			Alert msg = new Alert(Alert.AlertType.INFORMATION);
			msg.setHeaderText("Alerta");
			msg.setContentText("Login ou senha incorreto");
			msg.show();
		}
	}
}