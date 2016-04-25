package br.com.tt.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	@OneToOne(cascade={CascadeType.ALL}) //lado forte - cria um relacionamento um para um
	//(cascade={CascadeType.ALL}) - realiza operações em cascata
	@JoinColumn(name="id_end") //altera o nome da coluna chave estrangeira
	private Endereco endereco;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	

}
