package com.api.estoque.service;

import com.api.estoque.entity.Empresa;
import com.api.estoque.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    private final EmpresaRepository repository;

    public EmpresaService(EmpresaRepository repository) {
        this.repository = repository;
    }

    public List<Empresa> listar() {
        return repository.findAll();
    }

    public Empresa buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Empresa não encontrada"));
    }

    public Empresa salvar(Empresa empresa) {
        return repository.save(empresa);
    }
}