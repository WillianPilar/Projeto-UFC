package com.ufc.projectUFC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/ufc-api/v1")
public class lutadoresController {
	
	@GetMapping()
	public String hello() {
		return "Bem vindo a API UFC!";
	}
	
	@GetMapping("/All-Fighters")
	public String getAllFighters() {
		return "Aqui você tera a lista de todos os Lutadores!!";
	}

}
