package com.algaworks.algafood.domain.repository;

import java.util.List;

import com.algaworks.algafood.domain.model.Cozinha;


public interface CozinhaRepository {
	
	List<Cozinha> findAll();
	Cozinha findById(Long id);
	Cozinha save(Cozinha cozinha);
	void remove(Cozinha cozinha);

}
