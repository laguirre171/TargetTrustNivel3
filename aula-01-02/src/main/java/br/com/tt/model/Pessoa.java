package br.com.tt.model;

import java.io.Serializable;

import javax.persistence.Entity; //melhor escolha
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PESSOAS") //CRIA UMA TABELA COM NOME DIFERENTE DA CLASSE
public class Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //melhor escolha para não ter comflito	

	@Id
	@SequenceGenerator(name="pessoa_seq",sequenceName="pessoa_seq", allocationSize= 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pessoa_seq")
	private long id;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private TipoSeco tipoSexo;
	
	private Endereco endereco;
	
	public Endereco getEndereco(){
		return endereco;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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


	public TipoSeco getTipoSexo() {
		return tipoSexo;
	}


	public void setTipoSexo(TipoSeco tipoSexo) {
		this.tipoSexo = tipoSexo;
	}
	
	
	

}
