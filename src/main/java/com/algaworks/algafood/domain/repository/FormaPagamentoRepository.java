package com.algaworks.algafood.domain.repository;

import java.util.List;

import com.algaworks.algafood.domain.model.FormaPagamento;


public interface FormaPagamentoRepository {
	
	List<FormaPagamento> findAll();
	FormaPagamento findById(Long id);
	FormaPagamento save(FormaPagamento formaPagaento);
	void remove(FormaPagamento formaPagamento);

}
