package com.example.explicacionJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ExplicacionJpaApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(ExplicacionJpaApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(ExplicacionJpaApplication.class, args);
	}

}