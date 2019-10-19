package br.com.hospitalif.controller;

import java.io.IOException;
import java.sql.SQLException;

import app.Main;
import br.com.hospitalif.DAO.AtendenteDAO;
import br.com.hospitalif.model.Atendente;
import br.com.hospitalif.model.Funcionario;
import br.com.hospitalif.model.Pessoa;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class AtendenteController extends Main {

    @FXML
    private TextField txtCargo;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCPF;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextField txtTipoSanguineo;

    @FXML
    private TextField txtStatusPessoa;

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtSenha;

    @FXML
    private TextField txtStatusDeUsuario;

    @FXML
    private ToggleGroup sexo;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

    @FXML
    void salvar(ActionEvent event) throws SQLException {
    	RadioButton radio = (RadioButton) sexo.getSelectedToggle();
		// Pessoa
		Pessoa p = new Pessoa();
		p.setNome(txtNome.getText());
		p.setCpf(txtCPF.getText());
		p.setIdade(Integer.parseInt(txtIdade.getText()));
		p.setTipoSanguineo(txtTipoSanguineo.getText());
		p.setSexo(radio.getText());
		p.setStatusDaPessoa(txtStatusPessoa.getText());
		// Funcionario
		Funcionario f = new Funcionario();
		f.setLogin(txtLogin.getText());
		f.setSenha(txtSenha.getText());
		f.setStatusDeUsuario(txtStatusDeUsuario.getText());
		//Atendente
		Atendente a = new Atendente();
		a.setCargo(txtCargo.getText());
		// DAO
		AtendenteDAO aDAO = new AtendenteDAO();
		aDAO.save(p, f, a);
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
    	openpage(Rotas.ADMINISTRADOR);
    }
}