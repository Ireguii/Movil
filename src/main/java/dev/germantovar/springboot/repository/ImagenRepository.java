package dev.germantovar.springboot.repository;

import dev.germantovar.springboot.entities.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagenRepository extends JpaRepository<Imagen, Integer> {
}
