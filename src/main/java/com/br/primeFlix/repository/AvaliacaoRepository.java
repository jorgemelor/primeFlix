package com.br.primeFlix.repository;

import com.br.primeFlix.entity.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {

    List<Avaliacao> findById(Id id);

    @Query(value = "SELECT u.nome, a.avaliacao " +
            "FROM usuario u " +
            "INNER JOIN avaliacao a ON u.id_usuario = a.id_usuario " +
            "WHERE u.id_usuario = ?1", nativeQuery = true)
    public List<Avaliacao> buscarAvaliacaoPorUsuario(Long idUsuario);


}
