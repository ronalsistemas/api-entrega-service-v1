package com.rcasani.controller.dto;

import java.util.UUID;

public record EntregaResponse(
        Long id,
        UUID ordenId,
        String direccion,
        String estado,
        String entregaPersonaNombre
) {
}
