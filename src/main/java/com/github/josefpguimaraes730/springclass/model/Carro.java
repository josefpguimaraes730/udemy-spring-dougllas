package com.github.josefpguimaraes730.springclass.model;

import com.github.josefpguimaraes730.springclass.model.componentes.Motor;
import com.github.josefpguimaraes730.springclass.model.enums.Montadora;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Carro {
    private String modelo;
    private String cor;
    private Motor motor;
    private Montadora montadora;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", motor=" + motor +
                ", montadora=" + montadora +
                '}';
    }
}
