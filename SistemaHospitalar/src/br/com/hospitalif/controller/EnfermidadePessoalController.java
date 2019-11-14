package br.com.hospitalif.controller;

import java.io.IOException;
import java.sql.SQLException;

import app.Main;
import br.com.hospitalif.DAO.EnfermidadePessoalDAO;
import br.com.hospitalif.model.EnfermidadePessoal;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EnfermidadePessoalController extends Main {

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField txtComentario;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField txtStatusDeEnfermidade;

    @FXML
    void salvar(ActionEvent event) throws SQLException {
    	EnfermidadePessoal e = new EnfermidadePessoal();
    	e.setComentario(txtComentario.getText());
    	e.setStatusDeEnfermidade(txtStatusDeEnfermidade.getText());
    	EnfermidadePessoalDAO eDAO = new EnfermidadePessoalDAO();
    	eDAO.save(e);
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
