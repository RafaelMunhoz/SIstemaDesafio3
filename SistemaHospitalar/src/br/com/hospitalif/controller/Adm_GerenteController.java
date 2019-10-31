package br.com.hospitalif.controller;

import java.io.IOException;
import java.sql.SQLException;

import app.Main;
import br.com.hospitalif.DAO.GerenteDAO;
import br.com.hospitalif.model.Funcionario;
import br.com.hospitalif.model.Gerente;
import br.com.hospitalif.model.Pessoa;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Adm_GerenteController extends Main{

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

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
    private TextField txtStatusdaPessoa;

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtSenha;

    @FXML
    private TextField txtStatusDeUsuario;

    @FXML
    private TextField txtCargo;

    @FXML
    void salvar(ActionEvent event) throws SQLException {
    	//Pessoa
    	Pessoa p = new Pessoa();
    	p.setNome(txtNome.getText());
    	p.setCpf(txtCPF.getText());
    	p.setIdade(Integer.parseInt(txtIdade.getText()));
    	p.setTipoSanguineo(txtTipoSanguineo.getText());
    	p.setSexo(txtSexo.getText());
    	p.setStatusDaPessoa(txtStatusdaPessoa.getText());
    	//Funcionario
    	Funcionario f = new Funcionario();
    	f.setLogin(txtLogin.getText());
    	f.setSenha(txtSenha.getText());
    	f.setStatusDeUsuario(txtStatusDeUsuario.getText());
    	//Gerente
    	Gerente g = new Gerente();
    	g.setCargo(txtCargo.getText());
    	//DAO 
    	
    	 GerenteDAO gDAO = new GerenteDAO();
    	 gDAO.save(p,f,g); 
    	
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
    	openpage(Rotas.ADMINISTRADOR);
    }

}
