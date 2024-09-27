package com.example.demo.servicio;

import com.example.demo.modelo.Tarea;
import com.example.demo.repositorio.RepositorioTareas;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioTareas {
    private final RepositorioTareas repositorioTareas;

    public ServicioTareas(RepositorioTareas repositorioTareas) {
        this.repositorioTareas = repositorioTareas;
    }

    public List<Tarea> obtenerTodasLasTareas() {
        return repositorioTareas.encontrarTodas();
    }

    public Optional<Tarea> obtenerTareaPorId(Long id) {
        return repositorioTareas.encontrarPorId(id);
    }

    public Tarea crearOActualizarTarea(Tarea tarea) {
        return repositorioTareas.guardar(tarea);
    }

    public void eliminarTarea(Long id) {
        repositorioTareas.eliminarPorId(id);
    }
}
