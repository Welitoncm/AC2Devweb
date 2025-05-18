package com.example.agendamento.service;

import com.example.agendamento.model.Agenda;
import java.util.List;
import java.util.Optional;

public interface AgendaService {
    Agenda salvar(Agenda a);
    List<Agenda> listar();
    Optional<Agenda> buscar(Long id);
    void deletar(Long id);
}