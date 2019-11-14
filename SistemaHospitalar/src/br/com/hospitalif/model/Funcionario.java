package br.com.hospitalif.model;

public class Funcionario extends Pessoa{
	private Integer idFuncionario;
	private String login;
	private String senha;
	private String statusDeUsuario;
	
	public Integer getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getStatusDeUsuario() {
		return statusDeUsuario;
	}
	public void setStatusDeUsuario(String statusDeUsuario) {
		this.statusDeUsuario = statusDeUsuario;
	}
}
