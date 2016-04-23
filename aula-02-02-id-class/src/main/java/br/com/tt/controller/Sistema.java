package br.com.tt.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Curso;

public class Sistema {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
		em.getTransaction().begin();
		Curso curso = new Curso();
		curso.setCodigo("JPA");
		curso.setVersao(3);
		curso.setDescricao("JPA - MOR");
		curso.setDuracao(28);
		em.persist(curso);
		em.getTransaction().commit();
		System.exit(0);

	}
}
