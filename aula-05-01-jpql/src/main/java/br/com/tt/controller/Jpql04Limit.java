package br.com.tt.controller;

import static java.lang.System.out;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;

public class Jpql04Limit {

	public static void main(String[] args) {
		
		TypedQuery<Cliente> query = getEM().createQuery("SELECT c FROM Cliente c", Cliente.class);
		query.setFirstResult(1);
		query.setMaxResults(2);
		List<Cliente> clientes = query.getResultList();
		clientes.forEach(c->out.println(c));

	}
	
	private static EntityManager getEM(){
		return Persistence
				.createEntityManagerFactory("pu_jpa")
				.createEntityManager();
	}

}
