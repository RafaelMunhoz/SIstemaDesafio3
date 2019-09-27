package br.com.hospitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {

	@FXML
	private Button btnLogin;

	@FXML
	private TextField txtSenha;

	@FXML
	private TextField txtUsuario;

	@FXML
	void login(ActionEvent event) {
		String user = new String(txtUsuario.getText());
		String pass = new String(txtSenha.getText());  
		System.out.println(user + " " + pass);
		
		
//		Alert msg = new Alert(Alert.AlertType.INFORMATION);
//		msg.setHeaderText("header");
//		msg.setContentText("Content");
//		msg.show();
	}
}