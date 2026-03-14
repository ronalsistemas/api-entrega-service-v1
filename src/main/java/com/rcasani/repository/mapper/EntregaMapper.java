package com.rcasani.repository.mapper;

import com.rcasani.domain.Entrega;
import com.rcasani.infraestructure.entity.EntregaEntity;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EntregaMapper {

    public static Entrega toDomain(EntregaEntity entity) {
        Entrega domain = new Entrega();
        domain.setId(entity.getId());
        domain.setOrdenId(entity.getOrdenId());
        domain.setDireccion(entity.getDireccion());
        domain.setReferencia(entity.getReferencia());
        domain.setEntregaEstado(entity.getEntregaEstado());
        domain.setEntregaPersona(EntregaPersonaMapper.toDomain(entity.getEntregaPersona()));
        return domain;
    }

    public static EntregaEntity toEntity(Entrega entrega) {
        EntregaEntity entity = new EntregaEntity();
        entity.setId(entrega.getId());
        entity.setOrdenId(entrega.getOrdenId());
        entity.setDireccion(entrega.getDireccion());
        entity.setReferencia(entrega.getReferencia());
        entity.setEntregaPersona(EntregaPersonaMapper.toEntity(entrega.getEntregaPersona()));
        entity.setEntregaEstado(entrega.getEntregaEstado());

        return entity;
    }
}
