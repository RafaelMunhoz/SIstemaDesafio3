package br.com.hospitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class GerenteController {

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField txtCargo;

    @FXML
    void salvar(ActionEvent event) {
    	String cargo = new String(txtCargo.getText());
    	System.out.println(cargo);
    }

    @FXML
    void voltar(ActionEvent event) {

    }

}
