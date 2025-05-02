package dev.germantovar.springboot.controllersNotas;
import dev.germantovar.springboot.entitiesNotas.Notas;
import dev.germantovar.springboot.notasService.notasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
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

    @PostMapping("/notes")
    public Notas saveNota(@RequestBody Notas nota) {
        return notasService.saveNota(nota);
    }

    @PutMapping("/{id}")
    public Notas actualizarNota(@PathVariable Long id, @RequestBody Notas notaActualizada) {
        // Verificar si la nota existe
        Optional<Notas> notaExistente = notasService.getNotaById(id);

        if (!notaExistente.isPresent()) {
            // Si la nota no existe, puede devolver una excepción o un código de error
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Nota no encontrada");
        }


        Notas nota = notaExistente.get();
        nota.setTitle(notaActualizada.getTitle());
        nota.setContent(notaActualizada.getContent());
         nota.setCreatedAt(notaActualizada.getCreatedAt());

        return notasService.saveNota(nota);
    }

    @DeleteMapping("/{id}")
    public void deleteNota(@PathVariable Long id) {
        notasService.deleteNota(id);
    }



    
}
