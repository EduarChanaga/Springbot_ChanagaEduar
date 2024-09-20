package com.example.Tarea4.controller;

import com.example.Tarea4.model.Plato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Tarea4.service.PlatoServicio;

import java.util.List;

@RestController
@RequestMapping("/api/platos")
public class PlatoApiController {

    @Autowired
    private PlatoServicio platoServicio;

    // Recuperar todos los platos usando método GET
    @GetMapping
    public List<Plato> obtenerTodosLosPlatos() {
        return platoServicio.listarTodosLosPlatos();
    }

    // Crear nuevo plato usando método POST
    @PostMapping
    public Plato agregarPlato(@RequestBody Plato plato) {
        return platoServicio.crearPlato(plato);
    }

    // Modificar plato existente usando método PUT
    @PutMapping("/{id}")
    public Plato modificarPlato(@PathVariable Long id, @RequestBody Plato plato) {
        return platoServicio.actualizarPlato(id, plato);
    }

    // Eliminar plato usando método DELETE
    @DeleteMapping("/{id}")
    public void eliminarPlato(@PathVariable Long id) {
        platoServicio.borrarPlato(id);
    }
}
