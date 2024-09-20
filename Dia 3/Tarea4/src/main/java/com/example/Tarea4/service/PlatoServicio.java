package com.example.Tarea4.service;

import com.example.Tarea4.model.Plato;
import com.example.Tarea4.repository.PlatoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatoServicio {

    @Autowired
    private PlatoRepositorio platoRepositorio;

    public List<Plato> listarTodosLosPlatos() {
        return platoRepositorio.findAll();
    }

    public Plato crearPlato(Plato plato) {
        return platoRepositorio.save(plato);
    }

    public Plato actualizarPlato(Long id, Plato detallesPlato) {
        Plato plato = platoRepositorio.findById(id).orElseThrow(() -> new RuntimeException("Plato no encontrado"));
        plato.setNombre(detallesPlato.getNombre());
        plato.setPrecio(detallesPlato.getPrecio());
        plato.setDisponible(detallesPlato.isDisponible());
        return platoRepositorio.save(plato);
    }

    public void borrarPlato(Long id) {
        platoRepositorio.deleteById(id);
    }
}
