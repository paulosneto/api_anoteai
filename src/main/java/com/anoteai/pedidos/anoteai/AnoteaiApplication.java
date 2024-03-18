package com.anoteai.pedidos.anoteai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class AnoteaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnoteaiApplication.class, args);
	}

}
