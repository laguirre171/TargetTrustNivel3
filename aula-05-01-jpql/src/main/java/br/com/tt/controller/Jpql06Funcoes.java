package br.com.tt.controller;

import static java.lang.System.out;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;

public class Jpql06Funcoes {

	public static void main(String[] args) {
		soma();
		media();
		max();
		size();
	}

	private static void soma() {
		//Alt + shift + a - para copiar 			
		TypedQuery<Long> query = getEM().createQuery("SELECT SUM(c.id) FROM Cliente c ", Long.class);
		Long soma = query.getSingleResult();
		out.println("Soma dos Ids = " + soma);
	}
	
	private static void media() {
		//Alt + shift + a - para copiar 			
		TypedQuery<Double> query = getEM().createQuery("SELECT AVG(c.id) FROM Cliente c ", Double.class);
		Double soma = query.getSingleResult();
		out.println("Media dos Ids = " + soma);
	}
	
	private static void max() {
		//Alt + shift + a - para copiar 			
		TypedQuery<Long> query = getEM().createQuery("SELECT MAX(c.id) FROM Cliente c ", Long.class);
		Long soma = query.getSingleResult();
		out.println("MaX dos Ids = " + soma);
	}
	
	private static void size() {
		//Alt + shift + a - para copiar 			
		String sql = "SELECT SIZE(c.id) FROM Cliente c ";
		Class<Integer> clazz = Integer.class;
		EntityManager em = getEM();
		TypedQuery<Integer> query = getEM().createQuery(sql, clazz);
		
		Integer soma = query.getSingleResult();
		out.println("MaX dos Ids = " + soma);
	}

	
	private static EntityManager getEM(){
		return Persistence
				.createEntityManagerFactory("pu_jpa")
				.createEntityManager();
	}

}
