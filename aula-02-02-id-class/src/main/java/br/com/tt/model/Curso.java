package br.com.tt.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Curso {
	
	@Id
	private String codigo;
	@Id
	private Integer versao;
	
	
	

}
