package com.example.agendamento.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Resumo {
    @Id @GeneratedValue
    private Long id;
    private String descricao;
}
