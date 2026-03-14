package com.rcasani.infraestructure.repository;

import com.rcasani.infraestructure.entity.EntregaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface EntregaRepositoryJpa extends JpaRepository<EntregaEntity, Long> {

    Optional<EntregaEntity> findByOrdenId(UUID ordenId);

    @Query("SELECT d FROM EntregaEntity d JOIN FETCH d.entregaPersona WHERE d.id = :id")
    Optional<EntregaEntity> findByIdWithEntregaPersona(@Param("id") Long id);
}
