package com.example.explicacionJPA_P1;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer{
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/api/*") //Todas las rutas que comienzan con /api/
                .allowedOrigins("http://127.0.0.1:5500") // Permite las solicitudes de este origen
                .allowedMethods("GET", "POST", "PUT", "DELETE") //Metodos permitidos por la API
                .allowedHeaders("") //Permite todos los encabezados
                .allowCredentials(true); //Permite credenciales (cookies)
    }
}