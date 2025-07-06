package com.algaworks.algafood.infrastructure.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Component
public class CozinhaRepositoryImpl implements CozinhaRepository {
	

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Cozinha> findAll() {
		
		TypedQuery<Cozinha> query =	manager.createQuery("from Cozinha", Cozinha.class);
		 List<Cozinha> listaCozinha = query.getResultList();
		return listaCozinha;
	}

	@Override
	public Cozinha findById(Long id) {
		return manager.find(Cozinha.class, 1L);
	}

	@Override
	public Cozinha save(Cozinha cozinha) {
		return manager.merge(cozinha);
	}

	@Override
	public void remove(Cozinha cozinha) {
		Cozinha returnedCozinha = findById(cozinha.getId());
		manager.remove(returnedCozinha);
		
	}

}
