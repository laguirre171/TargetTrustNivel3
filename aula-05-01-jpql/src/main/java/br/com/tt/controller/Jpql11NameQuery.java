package br.com.tt.controller;

import static java.lang.System.exit;
import static java.lang.System.out;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;
import br.com.tt.vo.ClienteVO;

public class Jpql11NameQuery {

	public static void main(String[] args) {
		
		EntityManager em = getEM();
		Class<Cliente> clazz = Cliente.class;
		TypedQuery<Cliente> query;
		
		query = em.createNamedQuery(Cliente.ALL, clazz);
		List<Cliente> clientes = query.getResultList();
		clientes.forEach(c-> out.println(c));
		
	}
	
	private static EntityManager getEM(){
		return Persistence
				.createEntityManagerFactory("pu_jpa")
				.createEntityManager();
	}

	

}
