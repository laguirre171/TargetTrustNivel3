package br.com.tt.model;

import java.io.Serializable;

import javax.persistence.Entity; //melhor escolha
import javax.persistence.Id;

@Entity
public class Empresa implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 7739633688615774376L;
	
	@Id
	private Long id;
	private String nome;
	private Long cnpj;
	private String telefone;
	private String email;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCnpj() {
		return cnpj;
	}
	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
