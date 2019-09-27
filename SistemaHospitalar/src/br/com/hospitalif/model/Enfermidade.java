package br.com.hospitalif.model;

public class Enfermidade {
	private Integer idEnfermidade;
	private String nome;
	private String tipo;
	private String descricao;

	public Integer getIdEnfermidade() {
		return idEnfermidade;
	}

	public void setIdEnfermidade(Integer idEnfermidade) {
		this.idEnfermidade = idEnfermidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
