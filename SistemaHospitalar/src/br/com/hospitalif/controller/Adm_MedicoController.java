package br.com.hospitalif.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import app.Main;
import br.com.hospitalif.DAO.MedicoDAO;
import br.com.hospitalif.model.Funcionario;
import br.com.hospitalif.model.Medico;
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

public class Adm_MedicoController extends Main implements Initializable {

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
	private TextField txtEspecialidade;
	
	@FXML
	private ToggleGroup sexo;

	@FXML
	private RadioButton feminino;

	@FXML
	private RadioButton masculino;

	@FXML
	private Button btnSalvar;

	@FXML
	private Button btnVoltar;

	@FXML
	private Button btnTeste;

	@FXML
	private TableView<Medico> listaMedico;

	@FXML
	private TableColumn<Medico, String> tbColumnNome;

	@FXML
	private TableColumn<Medico, String> tbColumnCPF;

	@FXML
	private TableColumn<Medico, String> tbColumnIdade;

	@FXML
	private TableColumn<Medico, String> tbColumnTipoSanguineo;

	@FXML
	private TableColumn<Medico, String> tbColumnSexo;

	@FXML
	private TableColumn<Medico, String> tbColumnStatusPessoa;

	@FXML
	private TableColumn<Medico, String> tbColumnLogin;

	@FXML
	private TableColumn<Medico, String> tbColumnSenha;

	@FXML
	private TableColumn<Medico, String> tbColumnStatusDeUsuario;

	@FXML
	private TableColumn<Medico, String> tbColumnNumeroDeRegistro;

	@FXML
	private TableColumn<Medico, String> tbColumnEspecialidade;

	@FXML
	void salvar(ActionEvent event) throws SQLException, IOException {
		// Setters
		// Pessoa
		RadioButton radio = (RadioButton) sexo.getSelectedToggle();
		String nome = new String(txtNome.getText());
		String cpf = new String(txtCPF.getText());
		Integer idade = new Integer(Integer.parseInt(txtIdade.getText()));
		String tipoSanguineo = new String(txtTipoSanguineo.getText());
		String sexo = new String(radio.getText());
		String statusPessoa = new String(txtStatusPessoa.getText());
		Pessoa p = new Pessoa();
		p.setNome(nome);
		p.setCpf(cpf);
		p.setIdade(idade);
		p.setTipoSanguineo(tipoSanguineo);
		p.setSexo(sexo);
		p.setStatusDaPessoa(statusPessoa);
		// Funcionario
		String login = new String(txtLogin.getText());
		String senha = new String(txtSenha.getText());
		String statusDeUsuario = new String(txtStatusDeUsuario.getText());
		Funcionario f = new Funcionario();
		f.setLogin(login);
		f.setSenha(senha);
		f.setStatusDeUsuario(statusDeUsuario);
		// Medico
		Integer numeroDeRegistro = new Integer(txtNumeroDeRegistro.getText());
		String especialidade = new String(txtEspecialidade.getText());
		Medico m = new Medico();
		m.setNumeroderegistro(numeroDeRegistro);
		m.setEspecialidade(especialidade);
		// Instância de classe Medico_Data_Access_Object
		MedicoDAO medicoDAO = new MedicoDAO();
		medicoDAO.save(p, f, m);// -> Salva Médico no banco
		// MSG
		Alert msg = new Alert(Alert.AlertType.INFORMATION);
		msg.setTitle("Mensagem!");
		msg.setHeaderText("Cadastro concluído... ");
		msg.setContentText("Médico Salvo com Sucesso");
		msg.show();
		openpage(Rotas.ADM_MEDICO);
	}

	@FXML
	void teste(ActionEvent event) {
		try {
			txtNome.setText(listaMedico.getSelectionModel().getSelectedItem().getNome());
			txtCPF.setText(listaMedico.getSelectionModel().getSelectedItem().getCpf());
			txtIdade.setText(String.valueOf(listaMedico.getSelectionModel().getSelectedItem().getIdade()));
			txtTipoSanguineo.setText(listaMedico.getSelectionModel().getSelectedItem().getTipoSanguineo());
			txtStatusPessoa.setText(listaMedico.getSelectionModel().getSelectedItem().getStatusDaPessoa());
			txtLogin.setText(listaMedico.getSelectionModel().getSelectedItem().getLogin());
			txtSenha.setText(listaMedico.getSelectionModel().getSelectedItem().getSenha());
			txtStatusDeUsuario.setText(listaMedico.getSelectionModel().getSelectedItem().getStatusDeUsuario());
			txtEspecialidade.setText(listaMedico.getSelectionModel().getSelectedItem().getEspecialidade());
			txtNumeroDeRegistro.setText(String.valueOf(listaMedico.getSelectionModel().getSelectedItem().getNumeroderegistro()));
			String sexoSelecionado = (listaMedico.getSelectionModel().getSelectedItem().getSexo());
			if(sexoSelecionado.equals("Masculino")) {
				masculino.setSelected(true);
			} else if(sexoSelecionado.equals("Feminino")) {
				feminino.setSelected(true);
							}
		} catch (Exception e) {
			// TODO: handle exception
			Alert msg = new Alert(Alert.AlertType.WARNING);
			msg.setTitle("Mensagem!");
			msg.setHeaderText("Nenhum item selecionado!... ");
			msg.setContentText("Selecione um item da tabela para prosseguir");
			msg.show();
		}
	}

	@FXML
	void voltar(ActionEvent event) throws IOException {
		openpage(Rotas.ADMINISTRADOR);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// Iniciando TableView -> Relacionando valor das celulas com os atributos da
		// classe Medico
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
		tbColumnEspecialidade.setCellValueFactory(new PropertyValueFactory<>("especialidade"));
		MedicoDAO mDAO = new MedicoDAO();
		List<Medico> medico = mDAO.select();
		ObservableList<Medico> obsm = FXCollections.observableArrayList(medico);
		listaMedico.setItems(obsm);
	}
}