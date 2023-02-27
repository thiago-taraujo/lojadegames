package com.thiago.lojadegames.repository;

import com.thiago.lojadegames.model.Categoria;
import com.thiago.lojadegames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long> {
    List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
    List<Produto> findAllByCategoria(@Param("categoria")Optional<Categoria> categoria);
}
