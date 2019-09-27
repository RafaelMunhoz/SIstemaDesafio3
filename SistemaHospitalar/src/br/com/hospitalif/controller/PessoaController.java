package br.com.hospitalif.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PessoaController {

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCPF;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextField txtSexo;

    @FXML
    private TextField txtStatusDaPessoa;

    @FXML
    private TextField txtTipoSanguineo;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

    @FXML
    void salvar(ActionEvent event) {
    	String nome = new String(txtNome.getText());
    	String cpf = new String(txtCPF.getText());
    	String idade = new String(txtIdade.getText());
    	String sexo = new String(txtSexo.getText());
    	String statusDaPessoa = new String(txtStatusDaPessoa.getText());
    	String tipoSanguineo = new String(txtTipoSanguineo.getText());
    	System.out.println(nome + " " + cpf + " " + idade + " " + sexo + " " + statusDaPessoa + " " + tipoSanguineo);
    	
    }

    @FXML
    void voltar(ActionEvent event) {

    }

}
