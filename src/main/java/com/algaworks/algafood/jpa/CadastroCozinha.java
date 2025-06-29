package com.algaworks.algafood.jpa;

import java.util.List;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.domain.model.Cozinha;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Component
public class CadastroCozinha {
	
	@PersistenceContext
	private EntityManager manager;
	
	public List<Cozinha> findAll(){
		
	TypedQuery<Cozinha> query =	manager.createQuery("from Cozinha", Cozinha.class);
	 List<Cozinha> listaCozinha = query.getResultList();
	return listaCozinha;
	
	}
	
	@Transactional
	public Cozinha insert(Cozinha cozinha) {
		return manager.merge(cozinha);
	}

}
