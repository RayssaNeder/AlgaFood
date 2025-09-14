package com.algaworks.algafood.infrastructure.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.repository.CidadeRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Component
public class CidadeRepositoryImpl implements CidadeRepository {
	

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Cidade> findAll() {
		
		TypedQuery< Cidade> query =	manager.createQuery("from Cidade", Cidade.class);
		 List< Cidade> listaCozinha = query.getResultList();
		return listaCozinha;
	}

	@Override
	public  Cidade findById(Long id) {
		return manager.find(Cidade.class, 1L);
	}

	@Override
	public Cidade save(Cidade cidade) {
		return manager.merge(cidade);
	}

	@Override
	public void remove(Cidade cidade) {
		Cidade returnedCidade = findById(cidade.getId());
		manager.remove(returnedCidade);
		
	}

}
