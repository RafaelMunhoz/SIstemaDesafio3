package br.com.hospitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FuncionarioController {

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtSenha;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField txtStatusDoUsuario;

    @FXML
    private Button btnEntrar;

    @FXML
    void entrar(ActionEvent event) {
    	String user = new String(txtLogin.getText());
    	String pass = new String(txtSenha.getText());
    	String statusDoUsuario = new String(txtStatusDoUsuario.getText());
    	System.out.println(user + " " + pass + " " + statusDoUsuario);
    }

    @FXML
    void voltar(ActionEvent event) {

    }

}
