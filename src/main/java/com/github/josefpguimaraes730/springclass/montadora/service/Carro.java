package com.github.josefpguimaraes730.springclass.montadora.service;

import com.github.josefpguimaraes730.springclass.montadora.service.componentes.Chave;
import com.github.josefpguimaraes730.springclass.montadora.service.componentes.Motor;
import com.github.josefpguimaraes730.springclass.montadora.service.enums.Montadora;
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

    public CarroStatus darIgnicao(Chave chave) {
        if (chave.getMontadora() != this.montadora) {
            return new CarroStatus("Chave incompatível com o carro.");
        }

        return new CarroStatus(motor + "ligado com sucesso.");
    }
}
