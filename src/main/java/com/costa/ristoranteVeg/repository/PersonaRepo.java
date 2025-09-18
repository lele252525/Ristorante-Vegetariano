package com.costa.ristoranteVeg.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.costa.ristoranteVeg.model.Persona;

import jakarta.transaction.Transactional;

public interface PersonaRepo extends JpaRepository <Persona, Long>{
	
	public Optional<Persona> findById (Long id);
	
	@Transactional
	public void deleteById (Long id);
	
}
