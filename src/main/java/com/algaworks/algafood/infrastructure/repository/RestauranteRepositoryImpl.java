package com.algaworks.algafood.infrastructure.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Component
public class RestauranteRepositoryImpl implements RestauranteRepository {
	

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Restaurante> findAll() {
		
		TypedQuery< Restaurante> query =	manager.createQuery("from Restaurante", Restaurante.class);
		 List< Restaurante> listaCozinha = query.getResultList();
		return listaCozinha;
	}

	@Override
	public  Restaurante findById(Long id) {
		return manager.find(Restaurante.class, 1L);
	}

	@Override
	public Restaurante save(Restaurante restaurante) {
		return manager.merge(restaurante);
	}

	@Override
	public void remove(Restaurante restaurante) {
		Restaurante returnedRestaurante = findById(restaurante.getId());
		manager.remove(returnedRestaurante);
		
	}

}
