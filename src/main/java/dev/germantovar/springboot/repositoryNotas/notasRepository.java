package dev.germantovar.springboot.repositoryNotas;

import dev.germantovar.springboot.entitiesNotas.Notas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface notasRepository extends JpaRepository<Notas,Long> {
    List<Notas> findByCustomerId(Long customerId);
}
