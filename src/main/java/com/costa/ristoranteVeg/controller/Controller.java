package com.costa.ristoranteVeg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.costa.ristoranteVeg.DTO.DTOMapper;
import com.costa.ristoranteVeg.DTO.PersonaDTO;
import com.costa.ristoranteVeg.costanti.Costanti;
import com.costa.ristoranteVeg.model.Persona;
import com.costa.ristoranteVeg.service.PersonaServiceImpl;

@RestController
@RequestMapping (path = Costanti.GEST_CONTROLLER)
public class Controller {
	
	@Autowired
	PersonaServiceImpl service;
	
	@PostMapping (Costanti.SALVA_PERS)
	public ResponseEntity<Persona> salvaPersona (@RequestBody PersonaDTO personaDTO) {
		Persona persona = new Persona();
		if (personaDTO.isVegetariano() == true) {
			persona = DTOMapper.dtoToPersonaVegetariana(personaDTO);
			service.salva(persona);
		} else {
			persona = DTOMapper.dtoToPersonaNonVegetariana(personaDTO);
			service.salva(persona);
		}
		return ResponseEntity
		.status(HttpStatus.CREATED)
		.body(persona);
	}
	
}
