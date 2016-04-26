package br.com.tt.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity 
public class Curso implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="curso_seq", sequenceName="curso_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="curso_seq")
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private CursoType cursoType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CursoType getCursoType() {
		return cursoType;
	}

	public void setCursoType(CursoType cursoType) {
		this.cursoType = cursoType;
	}
	
	

}
