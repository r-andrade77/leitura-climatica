package com.clima.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clima.api.entities.LeituraClimatica;
import com.clima.api.services.LeituraClimaticaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/leitura")
public class LeituraClimaticaController {
	
	@Autowired
	private LeituraClimaticaService service;
	
	@GetMapping
	public List<LeituraClimatica> listar(){
		List<LeituraClimatica> climas = service.listarTodos();
		return climas;
	}
	
	@PostMapping
	public LeituraClimatica salvar(@Valid @RequestBody LeituraClimatica cilma) {
		LeituraClimatica climaSalvo = service.salvar(cilma);
		return climaSalvo;
	}

}
