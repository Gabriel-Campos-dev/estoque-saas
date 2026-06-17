package com.api.estoque.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "empresas")
public class Empresa {

    private Long id;
    private String nome;
    private String cnpj;
    private String email;
    private String telefone;
    private Boolean ativa;
    private LocalDateTime dataCricao;
    private LocalDateTime dataAtualizacao;

}
