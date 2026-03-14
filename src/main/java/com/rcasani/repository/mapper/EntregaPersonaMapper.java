package com.rcasani.repository.mapper;

import com.rcasani.domain.EntregaPersona;
import com.rcasani.infraestructure.entity.EntregaPersonaEntity;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EntregaPersonaMapper {

    public static EntregaPersona toDomain(EntregaPersonaEntity entity) {
        EntregaPersona persona = new EntregaPersona();
        persona.setId(entity.getId());
        persona.setNombre(entity.getNombre());
        persona.setTelefono(entity.getTelefono());
        persona.setTipoVehiculo(entity.getTipoVehiculo());
        persona.setLicencia(entity.getLicencia());
        return persona;
    }

    public static EntregaPersonaEntity toEntity(EntregaPersona persona) {
        EntregaPersonaEntity entity = new EntregaPersonaEntity();
        entity.setId(persona.getId());
        entity.setNombre(persona.getNombre());
        entity.setTelefono(persona.getTelefono());
        entity.setTipoVehiculo(persona.getTipoVehiculo());
        entity.setLicencia(persona.getLicencia());
        return entity;
    }
}
