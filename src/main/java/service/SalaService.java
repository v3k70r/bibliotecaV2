package service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.SalaRepository;
import java.util.List;
import model.Sala;
@Service
@RequiredArgsConstructor
public class SalaService {

    private final SalaRepository salaRepository;

    public List<Sala> listarTodas() {
        return salaRepository.findAll();
    }

    public Sala obtenerPorCodigo(Integer codigo) {
        return salaRepository.findById(codigo)
                .orElseThrow(() -> new RuntimeException("Sala no encontrada"));
    }

    public Sala guardar(Sala sala) {
        return salaRepository.save(sala);
    }

    public void eliminar(Integer codigo) {
        salaRepository.deleteById(codigo);
    }
}
