package com.rcasani.controller.mapper;

import com.rcasani.controller.dto.AsignarRepartidorRequest;
import com.rcasani.controller.dto.EntregaResponse;
import com.rcasani.domain.Entrega;
import com.rcasani.domain.EntregaPersona;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EntregaMapper {

    public static Entrega toDomain(AsignarRepartidorRequest request) {

        Entrega domain = new Entrega();
        domain.setOrdenId(request.ordenId());
        domain.setDireccion(request.entregaDireccion().direccion());
        domain.setReferencia(request.entregaDireccion().referencia());
        domain.setEntregaPersona(new EntregaPersona(request.entregaPersona().id()));

        return domain;
    }

    public static EntregaResponse toResponse(Entrega entrega) {
        return new EntregaResponse(
                entrega.getId(),
                entrega.getOrdenId(),
                entrega.getDireccion(),
                entrega.getEntregaEstado().name(),
                entrega.getEntregaPersona().getNombre()
        );
    }
}
