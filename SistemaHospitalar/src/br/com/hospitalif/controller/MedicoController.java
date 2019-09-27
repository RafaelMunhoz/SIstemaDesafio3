package br.com.hospitalif.controller;

import java.sql.SQLException;

import br.com.hospitalif.DAO.MedicoDAO;
import br.com.hospitalif.model.Medico;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MedicoController {

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField txtNumeroDeRegistro;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField txtEspecialidade;

    @FXML
    void salvar(ActionEvent event) throws SQLException {
    	Integer numeroDeRegistro = new Integer(txtNumeroDeRegistro.getText());
    	String especialidade = new String(txtEspecialidade.getText());
    	Medico m = new Medico();
    	m.setNumeroderegistro(numeroDeRegistro);
    	m.setEspecialidade(especialidade);
    	MedicoDAO medicoDAO = new MedicoDAO();
    	medicoDAO.save(m);
    	
    }

    @FXML
    void voltar(ActionEvent event) {

    }

}
