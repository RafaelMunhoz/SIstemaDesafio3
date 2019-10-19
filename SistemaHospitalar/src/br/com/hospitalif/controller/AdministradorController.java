package br.com.hospitalif.controller;

import java.io.IOException;

import app.Main;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AdministradorController extends Main{

    @FXML
    private Button btnCadastrarGerente;

    @FXML
    private Button btnCadastrarAtendente;

    @FXML
    private Button btnCadastrarEnfermeiro;

    @FXML
    private Button btnCadastrarMedico;

    @FXML
    private Button btnVoltar;

    @FXML
    void cadastrarAtendente(ActionEvent event) throws IOException {
    	openpage(Rotas.ADM_ATENDENTE);
    }

    @FXML
    void cadastrarEnfermeiro(ActionEvent event) throws IOException {
    	openpage(Rotas.ENFERMEIRO);
    }

    @FXML
    void cadastrarGerente(ActionEvent event) throws IOException {
    	openpage(Rotas.GERENTE);
    }

    @FXML
    void cadastrarMedico(ActionEvent event) throws IOException {
    	openpage(Rotas.MEDICO);
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }	

}
