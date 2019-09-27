package br.com.hospitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EnfermidadePessoalController {

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField txtComentario;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField txtStatusDeEnfermidade;

    @FXML
    void salvar(ActionEvent event) {
    	String comentario = new String(txtComentario.getText());
    	String statusDeEnfermidade = new String(txtStatusDeEnfermidade.getText());
    	System.out.println(comentario + " " + statusDeEnfermidade);
    }

    @FXML
    void voltar(ActionEvent event) {

    }

}
