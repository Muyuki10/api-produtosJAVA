package com.example.api_produtos.repository;

import com.example.api_produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByNome(String nome);
    List<Produto> findByNomeContaining(String nome);

    List<Produto> findByPrecoGreaterThan(Double preco);
    List<Produto> findByPrecoLessThan(Double preco);

    List<Produto> findByAtivoTrue();
    List<Produto> findTop3ByOrderByPrecoDesc();
    List<Produto> findByNomeIgnoreCase(String nome);
    List<Produto> findByNomeOrCategoria(String nome, String categoria);


}
