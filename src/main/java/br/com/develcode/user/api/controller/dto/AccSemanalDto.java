package br.com.develcode.user.api.controller.dto;

public class AccSemanalDto {

	private String nomeEmpresa;

	public AccSemanalDto() {
		super();
	}

	public AccSemanalDto(String nomeEmpresa) {
		super();
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	

}
