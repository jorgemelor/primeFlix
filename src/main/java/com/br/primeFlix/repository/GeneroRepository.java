package com.br.primeFlix.repository;

import com.br.primeFlix.entity.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {
    @Query
    List<Genero> findByGeneroContainsIgnoreCase(String genero);
}
