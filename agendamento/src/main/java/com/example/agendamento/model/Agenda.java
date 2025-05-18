package com.example.agendamento.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Agenda {
    @Id @GeneratedValue
    private Long id;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private LocalTime horarioInicio;
    private LocalTime horarioFim;
    private String cidade;
    private String estado;
    private String cep;
    private String endereco;

    @ManyToOne
    private Curso curso;

    @ManyToOne
    private Professor professor;

    @OneToOne(cascade = CascadeType.ALL)
    private Resumo resumo;
}