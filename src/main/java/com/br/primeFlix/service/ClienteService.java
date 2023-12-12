package com.br.primeFlix.service;

import com.br.primeFlix.entity.Avaliacao;
import com.br.primeFlix.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClienteService {

    @Autowired
    private AvaliacaoRepository repository;

    public List<Avaliacao> listaTodos(){
        return repository.findAll();
    }

    public Avaliacao create(Avaliacao avaliacao) {
        return repository.save(avaliacao);
    }

    public Avaliacao update(Avaliacao avaliacao) {
        return repository.save(avaliacao);
    }

    public List<Avaliacao> findAll() {
        return repository.findAll();
    }

    public Optional<Avaliacao> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

