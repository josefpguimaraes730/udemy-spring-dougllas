package com.github.josefpguimaraes730.springclass.repository;

import com.github.josefpguimaraes730.springclass.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRespository extends JpaRepository<Produto, String> {
    List<Produto> findByNome(String nome);
}
