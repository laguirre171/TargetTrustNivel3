package br.com.tt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity; //melhor escolha
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;;

@Entity
@Table(name = "T_PESSOAS", 
uniqueConstraints = @UniqueConstraint(columnNames = { "nome", "cpf" }))
@SequenceGenerator(name = "pessoa_seq", sequenceName = "pessoa_seq", allocationSize = 1)
public class Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //melhor escolha para n�o ter comflito	
	//fica acima do campo que quero que funcione
	@Id
	@SequenceGenerator(name="pessoa_seq",sequenceName="pessoa_seq", allocationSize= 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pessoa_seq")
	private long id;
	private String nome;
	@Column(length = 11, nullable=false, unique=true, updatable = false)
	private String cpf;
	private String telefone;
	private String email;
	@Column(name="sexo")
	private TipoSeco sexo;	
	private Endereco endereco;
		
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public TipoSeco getSexo(){
		return sexo;
	}
	
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
		return sexo;
	}


	public void setTipoSexo(TipoSeco tipoSexo) {
		this.sexo = tipoSexo;
	}
	
	
	

}
