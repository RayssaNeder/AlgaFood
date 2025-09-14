package com.algaworks.algafood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

@RestController    //ja tem o @Controller e o @ResponseBody - @Controller já tem o @Component(indica ao Spring que a classe anotada é um BEAN e que, portanto, deve ser instanciada e incluida no container Spring ao subir a aplicacao para que fique disponível para uso
@RequestMapping("/cozinhas")
public class CozinhaController {
	
	@Autowired
	private CozinhaRepository cozinhaRepository;

	@GetMapping
	public List<Cozinha> listar(){
		return cozinhaRepository.findAll();
	}
	
	@GetMapping("/{cozinhaId}")
	public Cozinha buscarPoId(@PathVariable Long cozinhaId){
		return cozinhaRepository.findById(cozinhaId);
	}
}
 