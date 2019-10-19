package br.com.hospitalif.controller;

import java.io.IOException;

import app.Main;
import br.com.hospitalif.util.Rotas;

//import java.time.Instant;
//import java.time.LocalDate;
//import java.time.ZoneId;
//import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AtendimentoController extends Main{

    @FXML
    private TextField txtPeso;

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField txtComentarioEnfermeiro;

    @FXML
    private TextField txtDoenca;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField txtAltura;

    @FXML
    private TextField txtComentarioMedico;

    @FXML
    private DatePicker pckData;

    @FXML
    void salvarAtendimento(ActionEvent event) {
//    	Float altura = new Float(txtAltura.getText());
//    	String comentarioEnfermeiro = new String(txtComentarioEnfermeiro.getText());
//    	String comentarioMedico = new String(txtComentarioMedico.getText());
//    	String doenca = new String(txtDoenca.getText());
//    	Float peso = new Float(txtPeso.getText());
//    	LocalDate localDate = pckData.getValue();
//    	Instant instant = Instant.from(localDate.atStartOfDay(ZoneId.systemDefault()));
//    	Date date = Date.from(instant);
    	

    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
