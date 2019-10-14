package br.com.hospitalif.controller;

import java.io.IOException;
import java.sql.SQLException;

import app.Main;
import br.com.hospitalif.DAO.MedicoDAO;
import br.com.hospitalif.model.Funcionario;
import br.com.hospitalif.model.Medico;
import br.com.hospitalif.model.Pessoa;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MedicoController extends Main{

    @FXML
    private TextField txtNumeroDeRegistro;

    @FXML
    private TextField txtEspecialidade;

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
    	//Pessoa
    	String nome = new String(txtNome.getText());
    	String cpf = new String(txtCPF.getText());
    	Integer idade = new Integer(Integer.parseInt(txtIdade.getText()));
    	String tipoSanguineo = new String(txtTipoSanguineo.getText());
    	String sexo = new String(txtSexo.getText());
    	String statusPessoa = new String(txtStatusPessoa.getText());
    	Pessoa p = new Pessoa();
    	p.setNome(nome);
    	p.setCpf(cpf);
    	p.setIdade(idade);
    	p.setTipoSanguineo(tipoSanguineo);
    	p.setSexo(sexo);
    	p.setStatusDaPessoa(statusPessoa);
    	//Funcionario
    	String login = new String(txtLogin.getText());
    	String senha = new String(txtSenha.getText());
    	String statusDeUsuario = new String(txtStatusDeUsuario.getText());    	
    	Funcionario f = new Funcionario();
    	f.setLogin(login);
    	f.setSenha(senha);
    	f.setStatusDeUsuario(statusDeUsuario);
    	//Medico
    	Integer numeroDeRegistro = new Integer(txtNumeroDeRegistro.getText());
    	String especialidade = new String(txtEspecialidade.getText());
    	Medico m = new Medico();
    	m.setNumeroderegistro(numeroDeRegistro);
    	m.setEspecialidade(especialidade);
    	
    	MedicoDAO medicoDAO = new MedicoDAO();
    	medicoDAO.save(p,f,m);
    }
    
    @FXML
    void voltar(ActionEvent event) throws IOException {
    	openpage(Rotas.ADMINISTRADOR);
    }

}