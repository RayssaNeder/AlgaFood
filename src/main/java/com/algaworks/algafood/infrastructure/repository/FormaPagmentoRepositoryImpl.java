package com.algaworks.algafood.infrastructure.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.domain.model.FormaPagamento;
import com.algaworks.algafood.domain.repository.FormaPagamentoRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Component
public class FormaPagmentoRepositoryImpl implements FormaPagamentoRepository {
	

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<FormaPagamento> findAll() {
		
		TypedQuery<FormaPagamento> query =	manager.createQuery("from FormaPagamento", FormaPagamento.class);
		 List< FormaPagamento> formaPagamento = query.getResultList();
		return formaPagamento;
	}

	@Override
	public  FormaPagamento findById(Long id) {
		return manager.find(FormaPagamento.class, 1L);
	}

	@Override
	public FormaPagamento save(FormaPagamento formaPagamento) {
		return manager.merge(formaPagamento);
	}

	@Override
	public void remove(FormaPagamento formaPagamento) {
		FormaPagamento returnedFormaPagamento = findById(formaPagamento.getId());
		manager.remove(returnedFormaPagamento);
		
	}

}
