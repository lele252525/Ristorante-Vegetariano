package com.costa.ristoranteVeg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.costa.ristoranteVeg.model.Persona;

public interface PersonaRepo extends JpaRepository <Persona, Long>{

}
