package br.com.hospitalif.model;

public class Medico extends Funcionario {
	private Integer numeroderegistro;
	private String especialidade;

	public Integer getNumeroderegistro() {
		return numeroderegistro;
	}

	public void setNumeroderegistro(Integer numeroderegistro) {
		this.numeroderegistro = numeroderegistro;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
