package br.com.tt.controlle;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Aluno;

public class Sistema02 {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
		
		Aluno aluno = new Aluno();
		aluno.setNome("teste");
		
		em.getTransaction().begin();		
		em.persist(aluno);
		
		//Aluno find = em.find(Aluno.class, 11L);
		//em.getTransaction().commit();
		//aluno.setNome("teste teste");
		//em.getTransaction().commit();
		System.exit(0);
	}
}
