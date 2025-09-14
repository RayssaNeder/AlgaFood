package com.algaworks.algafood.domain.repository;

import java.util.List;

import com.algaworks.algafood.domain.model.Permissao;


public interface PermissaoRepository {
	
	List<Permissao> findAll();
	Permissao findById(Long id);
	Permissao save(Permissao permissao);
	void remove(Permissao permissao);

}
