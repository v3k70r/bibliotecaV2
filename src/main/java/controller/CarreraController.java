package controller;

import model.Carrera;
import service.CarreraService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carreras")
@RequiredArgsConstructor
public class CarreraController {

    private final CarreraService carreraService;

    @GetMapping
    public List<Carrera> listar() {
        return carreraService.listarTodas();
    }

    @GetMapping("/{codigo}")
    public Carrera obtener(@PathVariable String codigo) {
        return carreraService.obtenerPorCodigo(codigo);
    }

    @PostMapping
    public Carrera crear(@RequestBody Carrera carrera) {
        return carreraService.guardar(carrera);
    }

    @PutMapping("/{codigo}")
    public Carrera actualizar(@PathVariable String codigo, @RequestBody Carrera carrera) {
        Carrera existente = carreraService.obtenerPorCodigo(codigo);
        existente.setNombre(carrera.getNombre()); //
        return carreraService.guardar(existente);
    }

    @DeleteMapping("/{codigo}")
    public void eliminar(@PathVariable String codigo) {
        carreraService.eliminar(codigo);
    }
}