package com.es.atividade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

// @SpringBootApplication
@SpringBootApplication
@EnableMongoRepositories
public class AtividadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeApplication.class, args);
	}

}
