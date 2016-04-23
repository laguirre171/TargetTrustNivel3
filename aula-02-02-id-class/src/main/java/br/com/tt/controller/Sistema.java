package br.com.tt.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Curso;
import br.com.tt.model.CursoPK;

public class Sistema {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
		em.getTransaction().begin();
		
		Curso curso = new Curso();
		curso.setCodigo("JPA");
		curso.setVersao(10);
		curso.setDescricao("JPA - MOR");
		curso.setDuracao(28);
		em.persist(curso);
		
		//em.getTransaction().commit();
		
		
		//em.getTransaction().begin();
		
		CursoPK cursoPk = new CursoPK();
		cursoPk.setCodigo("JPA");
		cursoPk.setVersao(3);
		
		//em.find(Curso.class, cursoPK);
		em.find(Curso.class, new CursoPK("JPA",3));
		System.out.println(em.find(Curso.class,new CursoPK("JPA",3)));
		
		em.remove(em.find(Curso.class, cursoPk));
		em.getTransaction().commit();
		
		System.exit(0);

	}
}
