package br.com.tt.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.GeneratedValue;

@Entity 
public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name="pessoa_seq", sequenceName="pessoa_seq", allocationSize=1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="pessoa_seq")
	private Long id;
	
	private String nome;
	@Column(length=11)
	private String cpf;
	@Temporal(TemporalType.DATE)
	@Column(name="DT_NASC")
	private Date dataNasc;
	
	

}
