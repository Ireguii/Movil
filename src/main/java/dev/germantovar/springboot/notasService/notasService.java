package dev.germantovar.springboot.notasService;
import dev.germantovar.springboot.entitiesNotas.Notas;
import java.util.List;
import java.util.Optional;

public interface notasService {
    List<Notas> getAllNotas();
    Optional<Notas> getNotaById(Long id);
    Notas saveNota(Notas nota);
    void deleteNota(Long id);
}
