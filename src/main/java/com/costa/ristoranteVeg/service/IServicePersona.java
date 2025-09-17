package com.costa.ristoranteVeg.service;

import com.costa.ristoranteVeg.DTO.PersonaDTO;

public interface IServicePersona {
	
	public void salva(PersonaDTO personaDTO);
	
	public PersonaDTO leggi(Long id);
	
}
