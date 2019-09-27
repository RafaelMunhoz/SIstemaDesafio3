package br.com.hosptitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Medico {

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField txtNumeroDeRegistro;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField txtEspecialidade;

    @FXML
    void salvar(ActionEvent event) {
    	Integer numeroDeRegistro = new Integer(txtNumeroDeRegistro.getText());
    	String especialidade = new String(txtEspecialidade.getText());
    	System.out.println(numeroDeRegistro + " " +especialidade);
    	
    }

    @FXML
    void voltar(ActionEvent event) {

    }

}
