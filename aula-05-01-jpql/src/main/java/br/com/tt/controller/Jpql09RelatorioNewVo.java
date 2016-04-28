package br.com.tt.controller;

import static java.lang.System.exit;
import static java.lang.System.out;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.tt.model.Cliente;
import br.com.tt.vo.ClienteVO;

public class Jpql09RelatorioNewVo {

	public static void main(String[] args) {
		
		EntityManager em = getEM();
		Class<ClienteVO> clazz = ClienteVO.class;
		String nomeDigitado = "  Pedro";
		String sql =  "SELECT ";
			   sql += "	NEW br.com.tt.vo.ClienteVO(";
			   sql += "	c.nome, c.cpf) ";
			   sql += "FROM Cliente c";
		
		TypedQuery<ClienteVO> query = em.createQuery(sql, clazz);
		List<ClienteVO> clientesVO = query.getResultList();
		clientesVO.forEach(c-> out.println(c));
		
	}
	
	private static EntityManager getEM(){
		return Persistence
				.createEntityManagerFactory("pu_jpa")
				.createEntityManager();
	}

	

}
