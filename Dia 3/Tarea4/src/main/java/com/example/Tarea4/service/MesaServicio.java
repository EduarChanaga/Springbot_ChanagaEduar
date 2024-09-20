package com.example.Tarea4.service;

import com.example.Tarea4.model.Mesa;
import com.example.Tarea4.repository.MesaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesaServicio {

    @Autowired
    private MesaRepositorio mesaRepositorio;

    public List<Mesa> listarTodasLasMesas() {
        try {
            return mesaRepositorio.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Error al listar las mesas", e);
        }
    }


    public Mesa crearMesa(Mesa mesa) {
        return mesaRepositorio.save(mesa);
    }

    public Mesa actualizarMesa(Long id, Mesa mesaDetails) {
        Mesa mesa = mesaRepositorio.findById(id).orElseThrow(() -> new RuntimeException("Mesa no encontrada"));
        mesa.setOcupada(mesaDetails.isOcupada());
        return mesaRepositorio.save(mesa);
    }

    public void borrarMesa(Long id) {
        mesaRepositorio.deleteById(id);
    }
}
