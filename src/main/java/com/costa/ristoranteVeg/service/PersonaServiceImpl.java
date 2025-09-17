package com.costa.ristoranteVeg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.costa.ristoranteVeg.model.Persona;
import com.costa.ristoranteVeg.repository.PersonaRepo;

@Service
public class PersonaServiceImpl implements IServicePersona {
	
	@Autowired
	PersonaRepo repo;

	
	@Override
	public void salva(Persona persona) {
		repo.save(persona);
	}
	
}
