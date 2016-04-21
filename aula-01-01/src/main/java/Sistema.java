

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tt.model.Pessoa;
import br.com.tt.model.TipoSeco;

public class Sistema {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_jpa");
		EntityManager em = emf.createEntityManager();
		System.out.println("Entity Manager está  " + em.isOpen());
		
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("12345");
		pessoa.setNome("Maria");
		pessoa.setTipoSexo(TipoSeco.MASCULINO);
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();		
	}

}
