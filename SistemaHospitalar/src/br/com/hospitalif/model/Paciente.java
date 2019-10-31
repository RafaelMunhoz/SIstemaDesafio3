package br.com.hospitalif.model;

public class Paciente {
	private Integer idPaciente;
	private String doenca;
	private String historico;

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}
}