package com.example.demo.controlador;

import com.example.demo.modelo.Tarea;
import com.example.demo.servicio.ServicioTareas;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class ControladorRestTareas {
    private final ServicioTareas servicioTareas;

    public ControladorRestTareas(ServicioTareas servicioTareas) {
        this.servicioTareas = servicioTareas;
    }

    @GetMapping
    public List<Tarea> obtenerTodasLasTareas() {
        return servicioTareas.obtenerTodasLasTareas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarea> obtenerTareaPorId(@PathVariable Long id) {
        return servicioTareas.obtenerTareaPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Tarea> crearOActualizarTarea(@RequestBody Tarea tarea) {
        return ResponseEntity.ok(servicioTareas.crearOActualizarTarea(tarea));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTarea(@PathVariable Long id) {
        servicioTareas.eliminarTarea(id);
        return ResponseEntity.noContent().build();
    }
}
