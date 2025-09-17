package com.costa.ristoranteVeg.model;

import com.costa.ristoranteVeg.costanti.Costanti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name= Costanti.TABELLA_PERSONE)
@Data
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = Costanti.NOME_PERSONE)
	private Long id;
	@Column(name = Costanti.NOME_PERSONE)
	private String nome;
	@Column(name = Costanti.VEG_PERSONE)
	private boolean vegetariano;
	
}
