package dev.germantovar.springboot.servicesImp;
import dev.germantovar.springboot.entitiesNotas.Notas;
import dev.germantovar.springboot.repositoryNotas.notasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.germantovar.springboot.notasService.notasService;
import java.util.List;
import java.util.Optional;
@Service
public class NotasServiceImpl implements notasService  {
    @Autowired
    private notasRepository notasRepository;

    @Override
    public List<Notas> getAllNotas() {
        return notasRepository.findAll();

}
    @Override
    public Optional<Notas> getNotaById(Long id) {
        return notasRepository.findById(id);
    }

    @Override
    public Notas saveNota(Notas nota) {
        return notasRepository.save(nota);
    }

    @Override
    public void deleteNota(Long id) {
        notasRepository.deleteById(id);
}
    }
