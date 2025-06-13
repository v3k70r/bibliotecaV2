package controller;

import model.Sala;
import service.SalaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salas")
@RequiredArgsConstructor
public class SalaController {

    private final SalaService salaService;

    @GetMapping
    public List<Sala> listar() {
        return salaService.listarTodas();
    }

    @GetMapping("/{codigo}")
    public Sala obtener(@PathVariable Integer codigo) {
        return salaService.obtenerPorCodigo(codigo);
    }

    @PostMapping
    public Sala crear(@RequestBody Sala sala) {
        return salaService.guardar(sala);
    }

    @PutMapping("/{codigo}")
    public Sala actualizar(@PathVariable Integer codigo, @RequestBody Sala sala) {
        sala.setCodigo(codigo);
        return salaService.guardar(sala);
    }

    @DeleteMapping("/{codigo}")
    public void eliminar(@PathVariable Integer codigo) {
        salaService.eliminar(codigo);
    }
}
