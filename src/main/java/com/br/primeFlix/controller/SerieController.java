package com.br.primeFlix.controller;

import com.br.primeFlix.entity.Serie;
import com.br.primeFlix.service.BebidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/series")
public class SerieController {
    @Autowired
    BebidaService service;

    @GetMapping("/listar-todos")
    @ResponseStatus(HttpStatus.OK)
    public List<Serie> findAll() {
        return service.listaTodos();
    }

    @GetMapping("/listar-por-nome/{nome}")
    @ResponseStatus(HttpStatus.OK)
    public List<Serie> buscarNome(@PathVariable String nome) {
        return service.listaPorNome(nome);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Serie> create(@RequestBody Serie serie) {
        Serie serieCreated = service.create(serie);
        return ResponseEntity.status(201).body(serieCreated);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Serie> update(@RequestBody Serie serie) {
        Serie serieCreated = service.create(serie);
        return ResponseEntity.status(201).body(serieCreated);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Serie> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    }

