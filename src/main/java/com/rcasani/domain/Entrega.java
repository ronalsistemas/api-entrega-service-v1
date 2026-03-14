package com.rcasani.domain;

import lombok.Data;

import java.util.UUID;

@Data
public class Entrega {
    private Long id;
    private UUID ordenId;
    private String direccion;
    private String referencia;
    private EntregaPersona entregaPersona;
    private EntregaEstado entregaEstado;
}
