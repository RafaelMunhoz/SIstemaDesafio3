package br.com.hospitalif.model;

import java.util.Date;

public class Entrada {
	private Integer idEntrada;
	private Date dataEntrada;
	private Date dataSaida;
	private String statusDeEntrada;
	private Atendimento situacaoDePaciente;

	public Integer getIdEntrada() {
		return idEntrada;
	}

	public void setIdEntrada(Integer idEntrada) {
		this.idEntrada = idEntrada;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getStatusDeEntrada() {
		return statusDeEntrada;
	}

	public void setStatusDeEntrada(String statusDeEntrada) {
		this.statusDeEntrada = statusDeEntrada;
	}

	public Atendimento getSituacaoDePaciente() {
		return situacaoDePaciente;
	}

	public void setSituacaoDePaciente(Atendimento situacaoDePaciente) {
		this.situacaoDePaciente = situacaoDePaciente;
	}
}
