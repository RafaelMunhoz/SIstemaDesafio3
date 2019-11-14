package br.com.hospitalif.controller;

import java.io.IOException;
import java.sql.SQLException;

import app.Main;
import br.com.hospitalif.DAO.EntradaDAO;
import br.com.hospitalif.model.Entrada;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class EntradaController extends Main{

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
    void salvar(ActionEvent event) throws SQLException {
    	Entrada e = new Entrada();
    	e.setDataEntrada(pckDataEntrada.getValue());
    	e.setDataSaida(pckDataSaida.getValue());
    	e.setStatusDeEntrada(txtStatusDeEntrada.getText());
    	e.setSituacaoDePaciente(txtSituacaoDoPaciente.getText());
    	EntradaDAO eDAO = new EntradaDAO();
    	eDAO.save(e);
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}