package br.com.hosptitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Pessoa {

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCPF;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextField txtSexo;

    @FXML
    private Label txtStatusDaPessoa;

    @FXML
    private TextField txtTipoSanguineo;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

    @FXML
    void salvar(ActionEvent event) {

    }

}
