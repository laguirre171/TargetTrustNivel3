package br.com.tt.petshopmil.service;

import java.util.List;

import br.com.tt.petshopmil.dao.PetDao;
import br.com.tt.petshopmil.model.Pet;

public class PetService {

	public List<Pet> consultar(Pet pet) {
		List<Pet> resultado = null;
		if (pet != null && pet.getNome() != null) {
			PetDao petDao = new PetDao();
			String nome = pet.getNome();
			nome = "'%" + nome + "%'";
			pet.setNome(nome);
			resultado = petDao.consultar(pet);
		}
		return resultado;
	}
}
