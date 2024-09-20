package com.example.Tarea4.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Tarea4.model.Mesa;
import com.example.Tarea4.service.MesaServicio;

import java.util.List;

@RestController
@RequestMapping("/api/mesas")
public class MesaApiController {

    @Autowired
    private MesaServicio mesaServicio;

    // Recuperar todas las mesas usando método GET
    @GetMapping
    public List<Mesa> obtenerTodasLasMesas() {
        return mesaServicio.listarTodasLasMesas();
    }

    // Crear nueva mesa usando método POST
    @PostMapping
    public Mesa agregarMesa(@RequestBody Mesa mesa) {
        return mesaServicio.crearMesa(mesa);
    }

    // Modificar mesa existente usando método PUT
    @PutMapping("/{id}")
    public Mesa modificarMesa(@PathVariable Long id, @RequestBody Mesa mesa) {
        return mesaServicio.actualizarMesa(id, mesa);
    }

    // Eliminar mesa usando método DELETE
    @DeleteMapping("/{id}")
    public void eliminarMesa(@PathVariable Long id) {
        mesaServicio.borrarMesa(id);
    }
}
