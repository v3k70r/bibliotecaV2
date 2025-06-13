package controller;

import model.TipoSala;
import service.TipoSalaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-sala")
@RequiredArgsConstructor
public class TipoSalaController {

    private final TipoSalaService tipoSalaService;

    @GetMapping
    public List<TipoSala> listar() {
        return tipoSalaService.listarTodos();
    }

    @GetMapping("/{id}")
    public TipoSala obtener(@PathVariable Integer id) {
        return tipoSalaService.obtenerPorId(id);
    }

    @PostMapping
    public TipoSala crear(@RequestBody TipoSala tipoSala) {
        return tipoSalaService.guardar(tipoSala);
    }

    @PutMapping("/{id}")
    public TipoSala actualizar(@PathVariable Integer id, @RequestBody TipoSala tipoSala) {
        TipoSala existente = tipoSalaService.obtenerPorId(id);
        existente.setNombre(tipoSala.getNombre());
        return tipoSalaService.guardar(existente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        tipoSalaService.eliminar(id);
    }
}
