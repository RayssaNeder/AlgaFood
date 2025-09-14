package com.algaworks.algafood.infrastructure.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Component
public class EstadoRepositoryImpl implements EstadoRepository {
	

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Estado> findAll() {
		
		TypedQuery< Estado> query =	manager.createQuery("from Estado", Estado.class);
		 List< Estado> listaCozinha = query.getResultList();
		return listaCozinha;
	}

	@Override
	public  Estado findById(Long id) {
		return manager.find(Estado.class, 1L);
	}

	@Override
	public Estado save(Estado estado) {
		return manager.merge(estado);
	}

	@Override
	public void remove(Estado estado) {
		Estado returnedEstado = findById(estado.getId());
		manager.remove(returnedEstado);
		
	}

}
