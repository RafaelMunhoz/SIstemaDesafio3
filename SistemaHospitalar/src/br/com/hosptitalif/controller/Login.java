package br.com.hosptitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Login {

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtSenha;

    @FXML
    private TextField txtUsuario;

    @FXML
    void login(ActionEvent event) {
    	
    	System.out.println(txtUsuario.getText());
    	Alert msg = new Alert(Alert.AlertType.INFORMATION);
    	msg.setContentText("Conteúdo aqui");
    	msg.setHeaderText("Cabeçalho aqui");
    	msg.show();
    }
}

