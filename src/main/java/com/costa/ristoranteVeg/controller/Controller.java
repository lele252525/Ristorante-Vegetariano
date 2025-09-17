package com.costa.ristoranteVeg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ResponseEntity<PersonaDTO> salvaPersona (@RequestBody PersonaDTO personaDTO) {
		service.salva(personaDTO);
		return ResponseEntity
		.status(HttpStatus.CREATED)
		.body(personaDTO);
	}
	
	@GetMapping(Costanti.LEGGI_PERS)
	public ResponseEntity<PersonaDTO> leggiPersona (@RequestParam Long id) {
		PersonaDTO personaDTO = new PersonaDTO();
		personaDTO = service.leggi(id); 
		return ResponseEntity
				.status(HttpStatus.FOUND)
				.body(personaDTO);
	}
	
}
