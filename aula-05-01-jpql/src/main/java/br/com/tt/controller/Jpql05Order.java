package br.com.tt.controller;

import static java.lang.System.out;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;

public class Jpql05Order {

	public static void main(String[] args) {
		//Alt + shift + a - para copiar 			
		TypedQuery<Cliente> query = getEM().createQuery("SELECT c FROM Cliente c " +
				                                        "ORDER BY c.nome DESC    ", Cliente.class);
		List<Cliente> clientes = query.getResultList();
		clientes.forEach(c->out.println(c));
	}
	
	private static EntityManager getEM(){
		return Persistence
				.createEntityManagerFactory("pu_jpa")
				.createEntityManager();
	}

}
