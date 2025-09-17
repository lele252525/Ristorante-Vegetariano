package com.costa.ristoranteVeg.DTO;

import com.costa.ristoranteVeg.model.Persona;

public class DTOMapper {
	
	public static Persona dtoToPersona (PersonaDTO personaDTO) {
		Persona persona = new Persona();
		persona.setId(personaDTO.getId());
		persona.setNome(personaDTO.getNome());
		persona.setVegetariano(personaDTO.isVegetariano());
		return persona;
	}
	
	public static PersonaDTO personaToDto (Persona persona) {
		PersonaDTO personaDTO = new PersonaDTO();
		personaDTO.setId(persona.getId());
		personaDTO.setNome(persona.getNome());
		personaDTO.setVegetariano(persona.isVegetariano());
		return personaDTO;
	}
	
}
