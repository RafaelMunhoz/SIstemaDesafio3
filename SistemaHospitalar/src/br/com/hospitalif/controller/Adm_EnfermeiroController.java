package br.com.hospitalif.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import app.Main;
import br.com.hospitalif.DAO.EnfermeiroDAO;
import br.com.hospitalif.model.Enfermeiro;
import br.com.hospitalif.model.Funcionario;
import br.com.hospitalif.model.Pessoa;
import br.com.hospitalif.util.Rotas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

public class Adm_EnfermeiroController extends Main implements Initializable {

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
	private TableView<Enfermeiro> listaEnfermeiro;

	@FXML
	private TableColumn<Enfermeiro, String> tbColumnNome;

	@FXML
	private TableColumn<Enfermeiro, String> tbColumnCPF;

	@FXML
	private TableColumn<Enfermeiro, String> tbColumnIdade;

	@FXML
	private TableColumn<Enfermeiro, String> tbColumnTipoSanguineo;

	@FXML
	private TableColumn<Enfermeiro, String> tbColumnSexo;

	@FXML
	private TableColumn<Enfermeiro, String> tbColumnStatusPessoa;

	@FXML
	private TableColumn<Enfermeiro, String> tbColumnLogin;

	@FXML
	private TableColumn<Enfermeiro, String> tbColumnSenha;

	@FXML
	private TableColumn<Enfermeiro, String> tbColumnStatusDeUsuario;

	@FXML
	private TableColumn<Enfermeiro, String> tbColumnNumeroDeRegistro;

	@FXML
	void salvar(ActionEvent event) throws SQLException, IOException {
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
		// Enfermeiro
		Enfermeiro e = new Enfermeiro();
		e.setNumeroderegistro(Integer.parseInt(txtNumeroDeRegistro.getText()));
		// DAO
		EnfermeiroDAO eDAO = new EnfermeiroDAO();
		eDAO.save(p, f, e);
		// MSG
		Alert msg = new Alert(Alert.AlertType.INFORMATION);
		msg.setTitle("Mensagem!");
		msg.setHeaderText("Cadastro concluído... ");
		msg.setContentText("Enfermeiro cadastrado com Sucesso");
		msg.show();
		openpage(Rotas.ADM_ENFERMEIRO);
	}

	@FXML
	void voltar(ActionEvent event) throws IOException {
		openpage(Rotas.ADMINISTRADOR);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		tbColumnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tbColumnCPF.setCellValueFactory(new PropertyValueFactory<>("cpf"));
		tbColumnIdade.setCellValueFactory(new PropertyValueFactory<>("idade"));
		tbColumnTipoSanguineo.setCellValueFactory(new PropertyValueFactory<>("tipoSanguineo"));
		tbColumnSexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
		tbColumnStatusPessoa.setCellValueFactory(new PropertyValueFactory<>("statusDaPessoa"));
		tbColumnLogin.setCellValueFactory(new PropertyValueFactory<>("login"));
		tbColumnSenha.setCellValueFactory(new PropertyValueFactory<>("senha"));
		tbColumnStatusDeUsuario.setCellValueFactory(new PropertyValueFactory<>("statusDeUsuario"));
		tbColumnNumeroDeRegistro.setCellValueFactory(new PropertyValueFactory<>("numeroderegistro"));
		EnfermeiroDAO eDAO = new EnfermeiroDAO();
		List<Enfermeiro> enfermeiro = eDAO.select();
		ObservableList<Enfermeiro> obsm = FXCollections.observableArrayList(enfermeiro);
		listaEnfermeiro.setItems(obsm);
	}
}