package com.example.explicacionJPA_P1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ExplicacionJpaP1Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(ExplicacionJpaP1Application.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(ExplicacionJpaP1Application.class, args);
    }

}