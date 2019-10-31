package br.com.hospitalif.controller;

import java.io.IOException;

import app.Main;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AtendenteController extends Main {

    @FXML
    private Button btnVoltar;

    @FXML
    private Button btnCadastrarPaciente;

    @FXML
    void cadastrarPaciente(ActionEvent event) throws IOException {
    	openpage(Rotas.ATENDENTE_PACIENTE);
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}