package br.com.tt.controller;

import static java.lang.System.exit;
import static java.lang.System.out;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;

public class Jpql02ConsultaComParametro {

	public static void main(String[] args) {
		EntityManager em = getEM();
		String sql = "SELECT c FROM Cliente c WHERE c.nome = :nome";
		em.createQuery(sql, Cliente.class);
		TypedQuery<Cliente> query = em.createQuery(sql, Cliente.class);
		query.setParameter("nome", "Pedro");
		List<Cliente> resultList = query.getResultList();			
		resultList.forEach(c-> out.println(c));
		exit(0);
	}
	
	private static EntityManager getEM(){
		return Persistence
				.createEntityManagerFactory("pu_jpa")
				.createEntityManager();
	}

}
