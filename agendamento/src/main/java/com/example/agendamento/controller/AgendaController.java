package com.example.agendamento.controller;

import com.example.agendamento.model.Agenda;
import com.example.agendamento.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendas")
public class AgendaController {

    @Autowired
    private AgendaService service;

    @PostMapping
    public ResponseEntity<Agenda> salvar(@RequestBody Agenda a) {
        return ResponseEntity.ok(service.salvar(a));
    }

    @GetMapping
    public List<Agenda> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Agenda> buscar(@PathVariable Long id) {
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
