package com.br.primeFlix.controller;

import com.br.primeFlix.entity.Usuario;
import com.br.primeFlix.service.RegistroPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    RegistroPedidoService service;

    @GetMapping("/listar-todos")
    public List<Usuario> findAll() {
        return service.listaTodos();
    }

    @GetMapping("/listar-por-nome/{nome}")
    public List<Usuario> buscarNome(@PathVariable String nome) {
        return service.listaPorNome(nome);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario) {
        Usuario usuarioCreated = service.create(usuario);
        return ResponseEntity.status(201).body(usuarioCreated);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario) {
        Usuario usuarioCreated = service.create(usuario);
        return ResponseEntity.status(201).body(usuarioCreated);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Optional<Usuario> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}