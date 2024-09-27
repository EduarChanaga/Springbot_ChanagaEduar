package com.example.demo.repositorio;

import com.example.demo.modelo.Tarea;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioTareas {
    private final List<Tarea> tareas = new ArrayList<>();
    private Long siguienteId = 1L;

    public RepositorioTareas() {
        // Añadir algunas tareas iniciales
        tareas.add(new Tarea(siguienteId++, "Tarea Inicial 1", false));
        tareas.add(new Tarea(siguienteId++, "Tarea Inicial 2", true));
    }

    public List<Tarea> encontrarTodas() {
        return tareas;
    }

    public Optional<Tarea> encontrarPorId(Long id) {
        return tareas.stream().filter(tarea -> tarea.getId().equals(id)).findFirst();
    }

    public Tarea guardar(Tarea tarea) {
        if (tarea.getId() == null) {
            tarea.setId(siguienteId++);
            tareas.add(tarea);
        } else {
            eliminarPorId(tarea.getId());
            tareas.add(tarea);
        }
        return tarea;
    }

    public void eliminarPorId(Long id) {
        tareas.removeIf(tarea -> tarea.getId().equals(id));
    }
}
