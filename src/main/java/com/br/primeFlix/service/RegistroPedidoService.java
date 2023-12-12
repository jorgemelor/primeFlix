package com.br.primeFlix.service;

import com.br.primeFlix.repository.UsuarioRepository;
import com.br.primeFlix.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class RegistroPedidoService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> listaTodos(){
        return repository.findAll();
    }

    public List<Usuario> listaPorNome(String nome){

        return repository.findByNomeContainsIgnoreCase(nome);
    }


    public Usuario create(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario update(Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Optional<Usuario> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}