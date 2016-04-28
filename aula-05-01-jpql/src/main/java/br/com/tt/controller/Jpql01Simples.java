package br.com.tt.controller;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import static java.lang.System.exit;
import static java.lang.System.out;
import br.com.tt.model.Cliente;

public class Jpql01Simples {

	public static void main(String[] args) {
		EntityManager em = getEM();
		//salvarCliente();
		String sql = "SELECT c FROM Cliente c";
		TypedQuery<Cliente> query = em.createQuery(sql, Cliente.class);
		List<Cliente> resultList = query.getResultList();
		resultList.forEach(c-> out.println(c));
		exit(0);
	}
	
	private static EntityManager getEM(){
		return Persistence
				.createEntityManagerFactory("pu_jpa")
				.createEntityManager();
	}
	
	private static void salvarCliente(){
		Cliente cliente = new Cliente();
		cliente.setNome("Pedro");
		cliente.setCpf("0123456");
		cliente.setRg("063214");
		Calendar data = Calendar.getInstance();
		data.set(1980, Calendar.MARCH, 10);
		//data.set(1980,0,10);
		cliente.setDataNasc(data.getTime());	
		
		EntityManager em = getEM();
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
	}

}
