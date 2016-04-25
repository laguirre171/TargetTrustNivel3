package br.com.tt.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name="pessoa_seq", sequenceName="pessoa_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pessoa_seq")
	private Long Id;
	private String nome;
	private List<Telefone> telefones;
	

}
