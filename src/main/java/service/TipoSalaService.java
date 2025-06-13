package service;

import lombok.RequiredArgsConstructor;
import model.TipoSala;
import org.springframework.stereotype.Service;
import repository.TipoSalaRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoSalaService{

    private final TipoSalaRepository tipoSalaRepository;

    public List<TipoSala> listarTodos() {
        return tipoSalaRepository.findAll();
    }

    public TipoSala obtenerPorId(Integer id) {
        return tipoSalaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tipo de sala no encontrado"));
    }

    public TipoSala guardar(TipoSala tipoSala) {
        return tipoSalaRepository.save(tipoSala);
    }

    public void eliminar(Integer id) {
        tipoSalaRepository.deleteById(id);
    }
}
