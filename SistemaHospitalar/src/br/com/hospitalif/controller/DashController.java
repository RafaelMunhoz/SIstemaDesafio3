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
    private Button btnEnfermeiro;

    @FXML
    private Button btnEnfermidade;

    @FXML
    private Button btnEnfermidadePessoal;

    @FXML
    private Button btnEntrada;

    @FXML
    private Button btnFuncionario;

    @FXML
    private Button btnGerente;

    @FXML
    private Button btnMedico;

    @FXML
    private Button btnPaciente;

    @FXML
    private Button btnPessoa;

    @FXML
    void administradorController(ActionEvent event) throws IOException {
    	openpage(Rotas.ADMINISTRADOR);
    }

    @FXML
    void atendenteController(ActionEvent event) {

    }

    @FXML
    void atendimentoController(ActionEvent event) {

    }

    @FXML
    void enfermeiroController(ActionEvent event) {

    }

    @FXML
    void enfermidadeController(ActionEvent event) {

    }

    @FXML
    void enfermidadePessoalController(ActionEvent event) {

    }

    @FXML
    void entradaController(ActionEvent event) {

    }

    @FXML
    void funcionarioController(ActionEvent event) {

    }

    @FXML
    void gerenteController(ActionEvent event) {

    }

    @FXML
    void medicoController(ActionEvent event) {

    }

    @FXML
    void pacienteController(ActionEvent event) {

    }

    @FXML
    void pessoaController(ActionEvent event) {

    }

}
