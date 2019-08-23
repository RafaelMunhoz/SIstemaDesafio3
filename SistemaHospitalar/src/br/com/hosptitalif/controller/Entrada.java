package br.com.hosptitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class Entrada {

    @FXML
    private TextField txtStatusDeEntrada;

    @FXML
    private TextField txtSituacaoDoPaciente;

    @FXML
    private DatePicker pckDataEntrada;

    @FXML
    private DatePicker pckDataSaida;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

    @FXML
    void salvar(ActionEvent event) {

    }

}
