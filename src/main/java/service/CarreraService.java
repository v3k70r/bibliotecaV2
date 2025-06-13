package service;

import lombok.RequiredArgsConstructor;
import model.Carrera;
import org.springframework.stereotype.Service;
import repository.CarreraRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CarreraService {

    private final CarreraRepository carreraRepository;

    public List<Carrera> listarTodas() {
        return carreraRepository.findAll();
    }

    public Carrera obtenerPorCodigo(String codigo) {
        return carreraRepository.findById(codigo)
                .orElseThrow(() -> new RuntimeException("Carrera no encontrada"));
    }

    public Carrera guardar(Carrera carrera) {
        return carreraRepository.save(carrera);
    }

    public void eliminar(String codigo) {
        carreraRepository.deleteById(codigo);
    }
}
