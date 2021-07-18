package com.ufc.projectUFC.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TbFighters {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	public String categoria;
	
	public float peso;
	
	public String nome;
	
	public int idade;
	
	public String doc_lutador;
	
	public String nacionalidade;
	
	public int vitorias;
	
	public int derrotas;
	
	public int empates;
	
	public int vitoriasPorFinalizacao;
	
}
