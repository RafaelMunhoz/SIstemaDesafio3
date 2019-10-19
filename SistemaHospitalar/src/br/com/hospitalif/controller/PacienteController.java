package br.com.hospitalif.controller;

import java.io.IOException;

import app.Main;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PacienteController extends Main{

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField txtHistorico;

    @FXML
    private TextField txtDoenca;

    @FXML
    private Button btnVoltar;

    @FXML
    void salvar(ActionEvent event) {
    	String historico = new String(txtHistorico.getText());
    	String doenca = new String(txtDoenca.getText());
    	System.out.println(historico + " " + doenca);
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
