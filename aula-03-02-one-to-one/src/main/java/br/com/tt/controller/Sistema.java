package br.com.tt.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Apostila;
import br.com.tt.model.Curso;


public class Sistema {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
		em.getTransaction().begin();
		
		Curso curso = new Curso();
		Apostila apostila = new Apostila();
		
			curso.setNome("APA");
			apostila.setNome("APA Dummies");
			curso.setApostila(apostila);
			curso.setApostila(apostila);
			apostila.setCurso(curso);
			
			
		em.persist(curso);	
		em.persist(apostila);	
		em.getTransaction().commit();
		//Endereco find = em.find(Endereco.class, endereco.getId());
		//System.out.println(find.getPessoa().getNome());
		//System.out.println(find.getRua());
		System.exit(0);

	}

}
