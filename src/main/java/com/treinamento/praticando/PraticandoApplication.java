package com.treinamento.praticando;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "com.treinamento.praticando.model" })
@EnableJpaRepositories(basePackages = { "com.treinamento.praticando.repository" })
@ComponentScan(basePackages = {"com.treinamento.praticando.controller"})
public class PraticandoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(PraticandoApplication.class, args);
	}

}
