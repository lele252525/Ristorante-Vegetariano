package com.costa.ristoranteVeg.DTO;

import org.springframework.beans.factory.annotation.Autowired;

import com.costa.ristoranteVeg.model.Persona;
import com.costa.ristoranteVeg.service.PersonaServiceImpl;

public class DTOMapper {
	
	@Autowired
	PersonaServiceImpl service;
	
	public static Persona dtoToPersonaVegetariana (PersonaDTO personaDTO) {
		Persona persona = new Persona();
		persona.setId(personaDTO.getId());
		persona.setNome(personaDTO.getNome());
		persona.setVegetariano(personaDTO.isVegetariano());
		persona.setConsumoPasto("vegetariano...");
		return persona;
	}
	
	public static Persona dtoToPersonaNonVegetariana (PersonaDTO personaDTO) {
		Persona persona = new Persona();
		persona.setId(personaDTO.getId());
		persona.setNome(personaDTO.getNome());
		persona.setVegetariano(personaDTO.isVegetariano());
		persona.setConsumoPasto("NON vegetariano...");
		return persona;
	}
	
	public static PersonaDTO personaToDto (Persona persona) {
		PersonaDTO personaDTO = new PersonaDTO();
		personaDTO.setId(persona.getId());
		personaDTO.setNome(persona.getNome());
		personaDTO.setVegetariano(persona.isVegetariano());
		personaDTO.setConsumoPasto(persona.getConsumoPasto());
		return personaDTO;
	}
	
}
