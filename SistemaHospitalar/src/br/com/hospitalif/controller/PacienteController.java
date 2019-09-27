package br.com.hospitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PacienteController {

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField txtHistorico;

    @FXML
    private TextField txtDoenca;

    @FXML
    private Button btnVoltar;

    @FXML
    void salvar(ActionEvent event) {
    	String historico = new String(txtHistorico.getText());
    	String doenca = new String(txtDoenca.getText());
    	System.out.println(historico + " " + doenca);
    }

    @FXML
    void voltar(ActionEvent event) {

    }

}
