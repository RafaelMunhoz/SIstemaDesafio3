package br.com.hospitalif.model;

import java.time.LocalDate;

public class Entrada {
	private Integer idEntrada;
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	private String statusDeEntrada;
	private String situacaoDePaciente;

	public Integer getIdEntrada() {
		return idEntrada;
	}

	public void setIdEntrada(Integer idEntrada) {
		this.idEntrada = idEntrada;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getStatusDeEntrada() {
		return statusDeEntrada;
	}

	public void setStatusDeEntrada(String statusDeEntrada) {
		this.statusDeEntrada = statusDeEntrada;
	}

	public String getSituacaoDePaciente() {
		return situacaoDePaciente;
	}

	public void setSituacaoDePaciente(String situacaoDePaciente) {
		this.situacaoDePaciente = situacaoDePaciente;
	}
}
