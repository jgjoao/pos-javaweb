package com.example.pos.atividade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class AtividadeApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeApplication.class, args);
	}

}
