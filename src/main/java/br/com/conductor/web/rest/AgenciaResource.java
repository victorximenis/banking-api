package br.com.conductor.web.rest;

import br.com.conductor.entity.Agencia;
import br.com.conductor.service.AgenciaService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/agencia")
@RestController
public class AgenciaResource {

    private AgenciaService agenciaService;

    public AgenciaResource(AgenciaService a) {
        this.agenciaService = a;
    }

    @GetMapping("/{id}")
    public Agencia buscarPorId(@PathVariable Long id) {
        return this.agenciaService.buscarPorId(id);
    }

    @GetMapping
    public List<Agencia> listarAgencias() {
        return this.agenciaService.buscarTodos();
    }

    @PostMapping
    public ResponseEntity salvarConta(@RequestBody Agencia a) {
            try {
                this.agenciaService.salvar(a);
                return ResponseEntity.ok()
                        .headers(new HttpHeaders())
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(null);
            } catch (Exception e) {
                return ResponseEntity.unprocessableEntity()
                        .headers(new HttpHeaders())
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(null);
            }
    }

}
