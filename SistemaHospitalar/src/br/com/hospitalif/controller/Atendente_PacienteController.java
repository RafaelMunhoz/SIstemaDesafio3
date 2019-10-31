package br.com.hospitalif.controller;

import java.io.IOException;
import java.sql.SQLException;

import app.Main;
import br.com.hospitalif.DAO.PacienteDAO;
import br.com.hospitalif.model.Paciente;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Atendente_PacienteController extends Main{

    @FXML
    private GridPane cboSexo;

    @FXML
    private TextField txtDoenca;

    @FXML
    private TextField txtHistorico;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

    @FXML
    void salvar(ActionEvent event) throws SQLException {
    	Paciente paciente = new Paciente();
    	paciente.setDoenca(txtDoenca.getText());
    	paciente.setHistorico(txtHistorico.getText());
    	
    	PacienteDAO pDAO = new PacienteDAO();
    	pDAO.save(paciente);
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
    	openpage(Rotas.ATENDENTE);
    }
}