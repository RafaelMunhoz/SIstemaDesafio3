package br.com.hospitalif.controller;

import java.io.IOException;
import java.sql.SQLException;

import app.Main;
import br.com.hospitalif.DAO.EnfermidadeDAO;
import br.com.hospitalif.model.Enfermidade;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EnfermidadeController extends Main{

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtTipo;

    @FXML
    private TextField txtDescricao;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

    @FXML
    void salvar(ActionEvent event) throws SQLException {
    	Enfermidade e = new Enfermidade();
    	e.setNome(txtNome.getText());
    	e.setTipo(txtTipo.getText());
    	e.setDescricao(txtDescricao.getText());
    	EnfermidadeDAO eDAO = new EnfermidadeDAO();
    	eDAO.save(e);
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
