package com.algaworks.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;

public class AtualizarCozinhaMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Francesa");
		
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Japonesa");
		
		CadastroCozinha cadastroCozinha = context.getBean(CadastroCozinha.class);
		 cozinha1 = cadastroCozinha.insert(cozinha1);
		 cozinha2 = cadastroCozinha.insert(cozinha2);
		 
		 System.out.printf("Nova cozinha criada: %d - %s \n", cozinha1.getId(), cozinha1.getNome());
		 System.out.printf("Nova cozinha criada: %d - %s \n", cozinha2.getId(), cozinha2.getNome());

		
		
	}

}
