package br.com.tt.model.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Endereco;
import br.com.tt.model.Pessoa;

public class Sistema {

	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("pu_jpa").createEntityManager();
		em.getTransaction().begin();
		
		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();
			pessoa.setNome("John");
			pessoa.setCpf("123456");
			//pessoa.setDataNasc(06-06-1980);
				
			endereco.setPessoa(pessoa);
			pessoa.setEndereco(endereco);
			endereco.setBairro("Fátima");
			endereco.setCep("123456");
			endereco.setRua("Rua xxx");
			
		em.persist(pessoa);	
		em.persist(endereco);	
		em.getTransaction().commit();
		Endereco find = em.find(Endereco.class, endereco.getId());
		System.out.println(find.getPessoa().getNome());
		System.out.println(find.getRua());
		System.exit(0);

	}

}
