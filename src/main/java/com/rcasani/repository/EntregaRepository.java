package com.rcasani.repository;

import com.rcasani.domain.Entrega;
import com.rcasani.infraestructure.entity.EntregaEntity;
import com.rcasani.infraestructure.repository.EntregaRepositoryJpa;
import com.rcasani.repository.mapper.EntregaMapper;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class EntregaRepository {

    private final EntregaRepositoryJpa entregaRepository;
    private final EntityManager entityManager;

    public Optional<Entrega> findByIdWithEntregaPersona(Long id) {
        return entregaRepository.findByIdWithEntregaPersona(id).map(EntregaMapper::toDomain);
    }

    public Entrega save(Entrega entrega) {

        EntregaEntity saved = entregaRepository.save(EntregaMapper.toEntity(entrega));

        entityManager.flush();
        entityManager.refresh(saved);

        return EntregaMapper.toDomain(saved);
    }
}
