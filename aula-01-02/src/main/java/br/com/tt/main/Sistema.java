package br.com.tt.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tt.model.Endereco;
import br.com.tt.model.Pessoa;
import br.com.tt.model.TipoSeco;

public class Sistema {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_jpa");
		EntityManager em = emf.createEntityManager();

		try {

			System.out.println("Entity Manager está  " + em.isOpen());

			Pessoa pessoa = new Pessoa();
			pessoa.setCpf("12345");
			pessoa.setNome("Maria");
			Endereco endereco = new Endereco();
			endereco.setRua("Rua X");
			endereco.setNumero(12);
			endereco.setCep(123);
			endereco.setBairro("Fátima");
			pessoa.setTipoSexo(TipoSeco.MASCULINO);

			em.getTransaction().begin();
			em.persist(new Pessoa("Pedro", "456"));
			em.persist(new Pessoa("Carla", "1234"));
			em.persist(new Pessoa("Ana", "6666"));
			em.persist(pessoa);
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em != null) {
				em.clear();
				em.close();

			}
			if (emf != null) {
				emf.close();
			}

			System.out.println(e);

		}
	}

}
