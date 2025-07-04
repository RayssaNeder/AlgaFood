package com.algaworks.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;

public class CadastrarCozinhaMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);
		cozinha.setNome("Brasileira");
		
		
		
		CadastroCozinha cadastroCozinha = context.getBean(CadastroCozinha.class);
		 cozinha = cadastroCozinha.insert(cozinha);
		 
		 System.out.printf("Cozinha atualizada: %d - %s \n", cozinha.getId(), cozinha.getNome());

		
		
	}

}
