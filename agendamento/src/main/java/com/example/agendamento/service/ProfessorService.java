package com.example.agendamento.service;

import com.example.agendamento.model.Professor;
import java.util.List;
import java.util.Optional;

public interface ProfessorService {
    Professor salvar(Professor p);
    List<Professor> listar();
    Optional<Professor> buscar(Long id);
    void deletar(Long id);
}
