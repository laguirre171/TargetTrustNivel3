package br.com.tt.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Curso implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="curso_seq", sequenceName="curso_seq", allocationSize=1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="curso_seq")
	private Long id;
	
	private String Nome;
	
	@OneToOne(cascade={CascadeType.ALL}) 
	private Apostila apostila;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Apostila getApostila() {
		return apostila;
	}

	public void setApostila(Apostila apostila) {
		this.apostila = apostila;
	}
	
	
}
