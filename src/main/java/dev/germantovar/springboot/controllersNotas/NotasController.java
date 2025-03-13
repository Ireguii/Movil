package dev.germantovar.springboot.controllersNotas;
import dev.germantovar.springboot.entitiesNotas.Notas;
import dev.germantovar.springboot.notasService.notasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/notes")
public class NotasController {
    @Autowired
    private notasService notasService;

    @GetMapping
    public List<Notas> getAllNotas() {
        return notasService.getAllNotas();
    }

    @GetMapping("/{id}")
    public Optional<Notas> getNotaById(@PathVariable Long id) {
        return notasService.getNotaById(id);
    }
    @PostMapping
    public Notas saveNota(@RequestBody Notas nota) {
        return notasService.saveNota(nota);
    }

    @DeleteMapping("/{id}")
    public void deleteNota(@PathVariable Long id) {
        notasService.deleteNota(id);
    }
}
