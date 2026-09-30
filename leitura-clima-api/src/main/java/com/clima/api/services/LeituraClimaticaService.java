package com.clima.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clima.api.entities.LeituraClimatica;
import com.clima.api.repositories.LeituraClimaticaRepository;

@Service
public class LeituraClimaticaService {

	@Autowired
	private LeituraClimaticaRepository repository;
	
	public List<LeituraClimatica> listarTodos(){
		return repository.findAll();
	}
	
	public LeituraClimatica salvar(LeituraClimatica clima) {
		return repository.save(clima);
	}
	public void excluir(Long id) {
		repository.deleteById(id);
	}
}
