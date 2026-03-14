package com.rcasani.controller.dto;

import java.util.UUID;

public record AsignarRepartidorRequest(
        UUID ordenId,
        EntregaDireccionRequest entregaDireccion,
        EntregaPersonaRequest entregaPersona
) {
}
