package com.example.agendamento.service.impl;

import com.example.agendamento.model.Curso;
import com.example.agendamento.repository.CursoRepository;
import com.example.agendamento.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository repository;

    public Curso salvar(Curso c) {
        return repository.save(c);
    }

    public List<Curso> listar() {
        return repository.findAll();
    }

    public Optional<Curso> buscar(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
