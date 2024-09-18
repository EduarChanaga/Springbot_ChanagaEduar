// ProductApplication.java
package com.example.Dia2_tarea.controller;

import com.example.Dia2_tarea.ProductCLI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApplication implements CommandLineRunner {

    @Autowired
    private ProductCLI productCLI;

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

    @Override
    public void run(String... args) {
        productCLI.start();
    }
}