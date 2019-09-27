package br.com.hospitalif.model;


import java.util.Date;
import java.util.List;

public class Entrada {
	private int idEntrada;
	private Date dataEntrada;
	private Date dataDeSaida;
	private String statusDeEntrada;
	private List <Atendimento>situacaoDePaciente;
	
	public void setIdEntrada(int idEntrada) {
		this.idEntrada = idEntrada;
	}
	public int getIdEntrada() {
		return this. idEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Date getDataEntrada() {
		return this. dataEntrada;
	}
	
	public void setDataDeSaida(Date dataDeSaida) {
		this.dataDeSaida = dataDeSaida;
	}
	public Date getDataDeSaida() {
		return this.dataDeSaida;
	}
	
	public void setStatusDeEntrada(String statusDeEntrada) {
		this.statusDeEntrada = statusDeEntrada;
	}
	public String getStatusDeEntrada() {
		return this.statusDeEntrada;
	}
	
	public void setSituacaoDePaciente(List<Atendimento> situacaoDePaciente) {
		this.situacaoDePaciente = situacaoDePaciente;
	}
	public List<Atendimento> getSituacaoDePaciente() {
		return this.situacaoDePaciente;
	}
	
	

}