package br.com.hosptitalif.model;

public class Paciente {
	private Integer idPaciente;
	private EnfermidadePessoal doenca;
	private Entrada historico;

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public EnfermidadePessoal getDoenca() {
		return doenca;
	}

	public void setDoenca(EnfermidadePessoal doenca) {
		this.doenca = doenca;
	}

	public Entrada getHistorico() {
		return historico;
	}

	public void setHistorico(Entrada historico) {
		this.historico = historico;
	}
}