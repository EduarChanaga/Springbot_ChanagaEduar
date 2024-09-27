package com.example.demo.controlador;

import com.example.demo.servicio.ServicioTareas;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorVistaTareas {
    private final ServicioTareas servicioTareas;

    public ControladorVistaTareas(ServicioTareas servicioTareas) {
        this.servicioTareas = servicioTareas;
    }

    @GetMapping("/tareas")
    public String verTareas(Model modelo) {
        modelo.addAttribute("tareas", servicioTareas.obtenerTodasLasTareas());
        return "tareas";
    }
}
