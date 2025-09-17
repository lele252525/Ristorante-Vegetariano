package com.costa.ristoranteVeg.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name= "persone")
@Data
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpersone")
	private Long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "vegetariano")
	private boolean vegetariano;
	
}
