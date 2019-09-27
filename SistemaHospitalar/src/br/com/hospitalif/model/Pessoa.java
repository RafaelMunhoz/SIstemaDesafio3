package br.com.hosptitalif.model;

public class Pessoa {
	private Integer idPessoa;
	private String nome;
	private String cpf;
	private Integer idade;
	private String tipoSanguineo;
	private char sexo;
	private String statusDaPessoa;
	public Integer getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getStatusDaPessoa() {
		return statusDaPessoa;
	}
	public void setStatusDaPessoa(String statusDaPessoa) {
		this.statusDaPessoa = statusDaPessoa;
	}
}