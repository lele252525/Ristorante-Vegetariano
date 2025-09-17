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
	public void consumaPasto() {
		System.out.println("La persona consuma il pasto...");
	}

	@Override
	public void nonConsumaPasto() {
		System.out.println("La persona non consuma il pasto...");
		
	}
	
	@Override
	public void salva(Persona persona) {
		repo.save(persona);
	}
	
	
	
}
