package com.rcasani.infraestructure.entity;

import com.rcasani.domain.EntregaEstado;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "entregas")
public class EntregaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private UUID ordenId;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = true)
    private String referencia;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "entrega_persona_id", nullable = false)
    private EntregaPersonaEntity entregaPersona;

    @Enumerated(EnumType.STRING)
    private EntregaEstado entregaEstado;
}