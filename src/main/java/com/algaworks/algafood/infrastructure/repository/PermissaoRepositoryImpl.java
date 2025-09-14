package com.algaworks.algafood.infrastructure.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.repository.PermissaoRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Component
public class PermissaoRepositoryImpl implements PermissaoRepository {
	

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Permissao> findAll() {
		
		TypedQuery< Permissao> query =	manager.createQuery("from Permissao", Permissao.class);
		 List< Permissao> listaCozinha = query.getResultList();
		return listaCozinha;
	}

	@Override
	public  Permissao findById(Long id) {
		return manager.find(Permissao.class, 1L);
	}

	@Override
	public Permissao save(Permissao permissao) {
		return manager.merge(permissao);
	}

	@Override
	public void remove(Permissao permissao) {
		Permissao returnedPermissao = findById(permissao.getId());
		manager.remove(returnedPermissao);
		
	}

}
