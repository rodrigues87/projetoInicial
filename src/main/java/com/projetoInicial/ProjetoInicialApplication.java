package com.projetoInicial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProjetoInicialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoInicialApplication.class, args);
	}

}
