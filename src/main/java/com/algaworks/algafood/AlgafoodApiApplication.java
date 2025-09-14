package com.algaworks.algafood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //possui dentro dela a anotacao  @ComponentScan que é usada no Spring Framework para dizer ao contêiner onde procurar por componentes, como @Component, @Service, @Repository, e @Controller
public class AlgafoodApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgafoodApiApplication.class, args);
	}

}
