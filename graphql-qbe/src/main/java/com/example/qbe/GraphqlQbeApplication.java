package com.example.qbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlQbeApplication {

	public static void main(String[] args) {
		// TODO - Docker must be running on system as Pre-requisite
		SpringApplication.run(GraphqlQbeApplication.class, args);
	}

}
