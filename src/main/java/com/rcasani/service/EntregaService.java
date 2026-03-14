package com.rcasani.service;

import com.rcasani.domain.Entrega;
import com.rcasani.domain.EntregaEstado;
import com.rcasani.repository.EntregaPersonaRepository;
import com.rcasani.repository.EntregaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class EntregaService {

    private final EntregaRepository entregaRepository;
    private final EntregaPersonaRepository entregaPersonaRepository;

    @Transactional
    public Entrega assignDriver(Entrega entrega) {
        entregaPersonaRepository.getById(entrega.getEntregaPersona().getId())
                .orElseThrow(() -> new RuntimeException("No se encontró al repartidor"));

        entrega.setEntregaEstado(EntregaEstado.ASIGNADO);

        return entregaRepository.save(entrega);

    }
}
