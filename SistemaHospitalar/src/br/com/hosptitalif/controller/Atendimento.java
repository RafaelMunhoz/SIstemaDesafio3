package br.com.hosptitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class Atendimento {

    @FXML
    private TextField txtComentarioEnfermeiro;

    @FXML
    private TextField txtComentarioMedico;

    @FXML
    private TextField txtPeso;

    @FXML
    private TextField txtAltura;

    @FXML
    private TextField txtDoenca;

    @FXML
    private DatePicker pckData;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

    @FXML
    void salvarAtendimento(ActionEvent event) {

    }

}
