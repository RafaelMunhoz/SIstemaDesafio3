package br.com.hosptitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Enfermeiro {

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

