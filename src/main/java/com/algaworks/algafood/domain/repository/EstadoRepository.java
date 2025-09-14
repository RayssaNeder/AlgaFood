package com.algaworks.algafood.domain.repository;

import java.util.List;

import com.algaworks.algafood.domain.model.Estado;


public interface EstadoRepository {
	
	List<Estado> findAll();
	Estado findById(Long id);
	Estado save(Estado estado);
	void remove(Estado estado);

}
