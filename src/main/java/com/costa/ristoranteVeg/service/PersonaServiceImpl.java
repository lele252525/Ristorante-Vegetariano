package com.costa.ristoranteVeg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.costa.ristoranteVeg.DTO.DTOMapper;
import com.costa.ristoranteVeg.DTO.PersonaDTO;
import com.costa.ristoranteVeg.model.Persona;
import com.costa.ristoranteVeg.repository.PersonaRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PersonaServiceImpl implements IServicePersona {
	
	@Autowired
	PersonaRepo repo;
	
	@Override
	public void salva(PersonaDTO personaDTO) {
		Persona persona = new Persona();
		if (personaDTO.isVegetariano() == true) {
			persona = DTOMapper.dtoToPersonaVegetariana(personaDTO);
			repo.save(persona);
		} else {
			persona = DTOMapper.dtoToPersonaNonVegetariana(personaDTO);
			repo.save(persona);
		}
	}

	@Override
	public PersonaDTO leggi(Long id) {
		PersonaDTO personaDTO = new PersonaDTO();
		Optional<Persona> pers = repo.findById(id);
		if (pers.isPresent()) {
			personaDTO = DTOMapper.personaToDto(pers.get());
		} else {
			throw new EntityNotFoundException();
		}
		return personaDTO;
	}
	
}
