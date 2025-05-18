package com.example.agendamento.service;

import com.example.agendamento.model.Curso;
import java.util.List;
import java.util.Optional;

public interface CursoService {
    Curso salvar(Curso c);
    List<Curso> listar();
    Optional<Curso> buscar(Long id);
    void deletar(Long id);
}
