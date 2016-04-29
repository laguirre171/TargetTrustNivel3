package br.com.tt.petshopmil.controller;

import java.util.List;

import br.com.tt.petshopmil.model.Pet;
import br.com.tt.petshopmil.service.PetService;

@Path("/pet")
public class PetController {
	
	@Get("/pet/consultar/{nome}")
	public List<Pet> consultarNome(String nome){
		Pet pet = new Pet();
		PetService petService = new PetService();
		pet.setNome(nome);
		return petService.consultar(pet);
	}
}
