package br.com.hospitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EnfermeiroController {

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField txtNumeroDeRegistro;

    @FXML
    private Button btnVoltar;

    @FXML
    void salvar(ActionEvent event) {
    	Integer NumeroDeRegistro = new Integer(txtNumeroDeRegistro.getText());
    	System.out.println(NumeroDeRegistro);
    }

    @FXML
    void voltar(ActionEvent event) {

    }
}

