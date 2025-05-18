package com.example.agendamento.service;

import com.example.agendamento.model.Resumo;
import java.util.List;
import java.util.Optional;

public interface ResumoService {
    Resumo salvar(Resumo r);
    List<Resumo> listar();
    Optional<Resumo> buscar(Long id);
    void deletar(Long id);
}
