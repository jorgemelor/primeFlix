package com.br.primeFlix.repository;

import com.br.primeFlix.entity.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> {
    @Query
    List<Serie> findByNomeContainsIgnoreCase(String nome);
}
