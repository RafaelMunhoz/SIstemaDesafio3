package br.com.hospitalif.controller;

import java.io.IOException;
import java.sql.SQLException;

import app.Main;
import br.com.hospitalif.DAO.EnfermeiroDAO;
import br.com.hospitalif.model.Enfermeiro;
import br.com.hospitalif.model.Funcionario;
import br.com.hospitalif.model.Pessoa;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class EnfermeiroController extends Main{

	@FXML
	private TextField txtNumeroDeRegistro;

	@FXML
	private TextField txtNome;

	@FXML
	private TextField txtCPF;

	@FXML
	private TextField txtIdade;

	@FXML
	private TextField txtTipoSanguineo;

	@FXML
	private TextField txtSexo;

	@FXML
	private TextField txtStatusPessoa;

	@FXML
	private TextField txtLogin;

	@FXML
	private TextField txtSenha;

	@FXML
	private TextField txtStatusDeUsuario;

	@FXML
	private Button btnSalvar;

	@FXML
	private Button btnVoltar;

	@FXML
	void salvar(ActionEvent event) throws SQLException {
		// Pessoa
		Pessoa p = new Pessoa();
		p.setNome(txtNome.getText());
		p.setCpf(txtCPF.getText());
		p.setIdade(Integer.parseInt(txtIdade.getText()));
		p.setTipoSanguineo(txtTipoSanguineo.getText());
		p.setSexo(txtSexo.getText());
		p.setStatusDaPessoa(txtStatusPessoa.getText());
		// Funcionario
		Funcionario f = new Funcionario();
		f.setLogin(txtLogin.getText());
		f.setSenha(txtSenha.getText());
		f.setStatusDeUsuario(txtStatusDeUsuario.getText());
		// Enfermeiro
		Enfermeiro e = new Enfermeiro();
		e.setNumeroderegistro(Integer.parseInt(txtNumeroDeRegistro.getText()));
		//DAO 
		EnfermeiroDAO eDAO = new EnfermeiroDAO();
		eDAO.save(p, f, e);
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Informação");
		alert.setHeaderText("Cabeçalho");
		alert.setContentText("Conteúdo!");

		alert.show();
	}

	@FXML
	void voltar(ActionEvent event) throws IOException {
		openpage(Rotas.ADMINISTRADOR);
	}

}