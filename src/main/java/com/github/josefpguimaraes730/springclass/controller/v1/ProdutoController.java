package com.github.josefpguimaraes730.springclass.controller.v1;

import com.github.josefpguimaraes730.springclass.model.Produto;
import com.github.josefpguimaraes730.springclass.repository.ProdutoRespository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/v1/produtos")
public class ProdutoController {

    private ProdutoRespository produtoRespository;

    public ProdutoController(ProdutoRespository produtoRespository) {
        this.produtoRespository = produtoRespository;
    }

    @PostMapping("salvar")
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto salvo: " + produto);

        String id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRespository.save(produto);

        return produto;
    }

    @GetMapping("{id}")
    public Produto obterPorId(@PathVariable String id) {
        //Optional<Produto> produto = produtoRespository.findById(id);
        //return produto.isPresent() ? produto.get() : null;

        return produtoRespository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") String id) {
        produtoRespository.deleteById(id);
    }

    @PutMapping("{id}")
    public Produto atualizar(@PathVariable String id,
                             @RequestBody Produto produto) {
        produto.setId(id);
        produtoRespository.save(produto);

        return produto;
    }

    public List<Produto> buscar(@RequestParam("nome") String nome) {
        return produtoRespository.findByNome(nome);
    }
}
