package br.com.hosptitalif.model;

public class EnfermidadePessoal {
	private Integer idEnfermidadePessoal;
	private String comentario;
	private String statusDeEnfermidade;

	public Integer getIdEnfermidadePessoal() {
		return idEnfermidadePessoal;
	}

	public void setIdEnfermidadePessoal(Integer idEnfermidadePessoal) {
		this.idEnfermidadePessoal = idEnfermidadePessoal;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getStatusDeEnfermidade() {
		return statusDeEnfermidade;
	}

	public void setStatusDeEnfermidade(String statusDeEnfermidade) {
		this.statusDeEnfermidade = statusDeEnfermidade;
	}
}