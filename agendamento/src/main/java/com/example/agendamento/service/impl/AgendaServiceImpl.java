package com.example.agendamento.service.impl;

import com.example.agendamento.model.Agenda;
import com.example.agendamento.repository.AgendaRepository;
import com.example.agendamento.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaServiceImpl implements AgendaService {

    @Autowired
    private AgendaRepository repository;

    public Agenda salvar(Agenda a) {
        return repository.save(a);
    }

    public List<Agenda> listar() {
        return repository.findAll();
    }

    public Optional<Agenda> buscar(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}