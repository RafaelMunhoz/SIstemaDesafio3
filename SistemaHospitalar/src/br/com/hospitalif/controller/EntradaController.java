package br.com.hospitalif.controller;

import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class EntradaController {

    @FXML
    private Button btnSalvar;

    @FXML
    private DatePicker pckDataEntrada;

    @FXML
    private TextField txtSituacaoDoPaciente;

    @FXML
    private DatePicker pckDataSaida;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField txtStatusDeEntrada;

    @FXML
    void salvar(ActionEvent event) {
    	LocalDate localDateEntrada = pckDataEntrada.getValue();
    	LocalDate localDateSaida = pckDataSaida.getValue();
    	String situacaoDoPaciente = txtSituacaoDoPaciente.getText();
    	String statusDeEntrada = txtStatusDeEntrada.getText();   
    	System.out.println(localDateEntrada + " " + localDateSaida + " " + statusDeEntrada + " " + situacaoDoPaciente);
    	
    }

    @FXML
    void voltar(ActionEvent event) {

    }

}
