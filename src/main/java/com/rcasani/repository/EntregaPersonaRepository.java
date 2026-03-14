package com.rcasani.repository;

import com.rcasani.domain.EntregaPersona;
import com.rcasani.infraestructure.repository.EntregaPersonaRepositoryJPA;
import com.rcasani.repository.mapper.EntregaPersonaMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class EntregaPersonaRepository {

    private final EntregaPersonaRepositoryJPA repository;

    public Optional<EntregaPersona> getById(Long id) {
        return repository.findById(id).map(EntregaPersonaMapper::toDomain);
    }
}
