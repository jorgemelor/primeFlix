package com.br.primeFlix.service;

import com.br.primeFlix.repository.GeneroRepository;
import com.br.primeFlix.entity.Genero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FuncionarioService {

    @Autowired
    private GeneroRepository repository;

    public List<Genero> listaTodos() {
        return repository.findAll();
    }

    public List<Genero> listaPorNome(String genero) {

        return repository.findByGeneroContainsIgnoreCase(genero);
    }

    public Genero create(Genero genero) {
        return repository.save(genero);
    }

    public Genero update(Genero genero) {
        return repository.save(genero);
    }

    public List<Genero> findAll() {
        return repository.findAll();
    }

    public Optional<Genero> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}