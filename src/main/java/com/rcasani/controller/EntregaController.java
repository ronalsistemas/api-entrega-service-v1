package com.rcasani.controller;

import com.rcasani.controller.dto.AsignarRepartidorRequest;
import com.rcasani.controller.dto.EntregaResponse;
import com.rcasani.controller.mapper.EntregaMapper;
import com.rcasani.domain.Entrega;
import com.rcasani.service.EntregaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entrega")
public class EntregaController {

    private final EntregaService entregaService;

    public EntregaController(EntregaService entregaService) {
        this.entregaService = entregaService;
    }

    @PostMapping("/asignar-repartidor")
    public ResponseEntity<EntregaResponse> assignDriver(@RequestBody AsignarRepartidorRequest request) {
        Entrega entrega = entregaService.assignDriver(EntregaMapper.toDomain(request));
        return ResponseEntity.ok(EntregaMapper.toResponse(entrega));
    }
}
