package br.com.tt.controller;


import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Cliente;
import br.com.tt.model.Telefone;
import br.com.tt.model.TelefoneType;

public class Sistema {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
		em.getTransaction().begin();
		
		Cliente cliente = new Cliente();		
			cliente.setNome("Maria");
			cliente.addTelefone(new Telefone ("51","5555", TelefoneType.CELULAR)); //Adiciona telefone
			cliente.addTelefone(new Telefone ("51","6666", TelefoneType.COMERCIAL)); //Adiciona telefone
			
		em.persist(cliente);	
		em.getTransaction().commit();
		System.exit(0);

	}

}
