package br.com.tt.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name="cliente_seq", sequenceName="cliente_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente_seq")
	private Long Id;
	private String nome;
	
	@OneToMany(mappedBy="cliente", cascade=CascadeType.ALL)
	private List<Telefone> telefones;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	public void addTelefone(Telefone telefone){
		if ( telefones== null ){
			telefones = new ArrayList<Telefone>();			
		}
		telefone.setCliente(this);
		telefones.add(telefone);
	}
	

}
