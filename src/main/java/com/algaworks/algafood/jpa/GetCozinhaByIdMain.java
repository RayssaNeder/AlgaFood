package com.algaworks.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;

public class GetCozinhaByIdMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = context.getBean(CadastroCozinha.class);
		Cozinha cozinha = cadastroCozinha.findById(1L);
		
		
			System.out.printf("Cozinha %s \n", cozinha.getNome());
		
	}

}
