package br.com.hospitalif.controller;

import java.io.IOException;

import app.Main;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class DashController extends Main{

    @FXML
    private Button btnAdministrador;

    @FXML
    private Button btnAtendente;

    @FXML
    private Button btnAtendimento;

    @FXML
    private Button btnEnfermidade;

    @FXML
    private Button btnEnfermidadePessoal;

    @FXML
    private Button btnEntrada;

    @FXML
    private Button btnPaciente;

    @FXML
    void administradorController(ActionEvent event) throws IOException {
    	openpage(Rotas.ADMINISTRADOR);
    }

    @FXML
    void atendenteController(ActionEvent event) throws IOException {
    	openpage(Rotas.ATENDENTE);
    }

    @FXML
    void atendimentoController(ActionEvent event) throws IOException {
    	openpage(Rotas.ATENDIMENTO);
    }

    @FXML
    void enfermidadeController(ActionEvent event) throws IOException {
    	openpage(Rotas.ENFERMIDADE);
    }

    @FXML
    void enfermidadePessoalController(ActionEvent event) throws IOException {
    	openpage(Rotas.ENFERMIDADE_PESSOAL);
    }

    @FXML
    void entradaController(ActionEvent event) throws IOException {
    	openpage(Rotas.ENTRADA);
    }

    @FXML
    void pacienteController(ActionEvent event) throws IOException {
    	openpage(Rotas.PACIENTE);
    }

}
