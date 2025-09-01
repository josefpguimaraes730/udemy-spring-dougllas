package com.github.josefpguimaraes730.springclass.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@Table(name = "produto")
public class Produto {


    @Id
    //@Column(name= "id")
    private String id;

    private String nome;

    private String descricao;

    private Double preco;

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
