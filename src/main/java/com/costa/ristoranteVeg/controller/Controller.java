package com.costa.ristoranteVeg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.costa.ristoranteVeg.model.Persona;
import com.costa.ristoranteVeg.service.PersonaServiceImpl;

@RestController
@RequestMapping (path = "/gestione_controller")
public class Controller {
	
	@Autowired
	PersonaServiceImpl service;
	
	@PostMapping ("/salva_persona")
	public ResponseEntity<Persona> salvaPersona (@RequestBody Persona persona){
		service.salva(persona);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(persona);
	}
	
	
}
