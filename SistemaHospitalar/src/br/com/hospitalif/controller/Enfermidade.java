package br.com.hosptitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Enfermidade {

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField txtTipo;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtDescricao;

    @FXML
    void salvar(ActionEvent event) {
    	String tipo = new String(txtTipo.getText());
    	String nome = new String(txtNome.getText());
    	String descricao = new String(txtDescricao.getText());
    	System.out.println(nome + " " + tipo + " " + descricao);
    }

    @FXML
    void voltar(ActionEvent event) {

    }

}
