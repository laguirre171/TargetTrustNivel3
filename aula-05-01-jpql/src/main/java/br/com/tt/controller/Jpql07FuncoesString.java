package br.com.tt.controller;

import static java.lang.System.exit;
import static java.lang.System.out;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;

public class Jpql07FuncoesString {

	public static void main(String[] args) {
		
		EntityManager em = getEM();
		Class<Cliente> clazz = Cliente.class;
			String sql = "SELECT DISTINCT c FROM Cliente c ";
		
		TypedQuery<Cliente> query = em.createQuery(sql, clazz);
		//query.setParameter("nome",nomeDigitado);
		List<Cliente> clientes = query.getResultList();
		clientes.forEach(c-> out.println(c));
		
	}
	
	private static EntityManager getEM(){
		return Persistence
				.createEntityManagerFactory("pu_jpa")
				.createEntityManager();
	}

	

}
