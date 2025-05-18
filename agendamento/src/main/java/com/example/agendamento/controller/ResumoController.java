package com.example.agendamento.controller;

import com.example.agendamento.model.Resumo;
import com.example.agendamento.service.ResumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resumos")
public class ResumoController {

    @Autowired
    private ResumoService service;

    @PostMapping
    public ResponseEntity<Resumo> salvar(@RequestBody Resumo r) {
        return ResponseEntity.ok(service.salvar(r));
    }

    @GetMapping
    public List<Resumo> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resumo> buscar(@PathVariable Long id) {
        return service.buscar(id)
                      .map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
