package br.com.hospitalif.model;

import java.sql.Date;

public class Atendimento {
	private Integer idAtendimento;
	private String comentarioEnfermeiro;
	private String comentarioMedico;
	private Float peso;
	private Float altura;
	private Date data;
	private EnfermidadePessoal doenca;

	public Integer getIdAtendimento() {
		return idAtendimento;
	}

	public void setIdAtendimento(Integer idAtendimento) {
		this.idAtendimento = idAtendimento;
	}

	public String getComentarioEnfermeiro() {
		return comentarioEnfermeiro;
	}

	public void setComentarioEnfermeiro(String comentarioEnfermeiro) {
		this.comentarioEnfermeiro = comentarioEnfermeiro;
	}

	public String getComentarioMedico() {
		return comentarioMedico;
	}

	public void setComentarioMedico(String comentarioMedico) {
		this.comentarioMedico = comentarioMedico;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public EnfermidadePessoal getDoenca() {
		return doenca;
	}

	public void setDoenca(EnfermidadePessoal doenca) {
		this.doenca = doenca;
	}
}
