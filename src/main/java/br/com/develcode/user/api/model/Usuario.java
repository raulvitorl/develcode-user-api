package br.com.develcode.user.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String codigo;
	
	@Column
	private String nome;
	
	@Column
	private Date dataNascimento;
	
	@Column
	private String fotoUrl;

	public Usuario() {
		super();
	}

	public Usuario(Long id, String codigo, String nome, Date dataNascimento, String fotoUrl) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.fotoUrl = fotoUrl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getFotoUrl() {
		return fotoUrl;
	}

	public void setFotoUrl(String fotoUrl) {
		this.fotoUrl = fotoUrl;
	}
	
}
