package com.github.josefpguimaraes730.springclass.exemplos.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class UsoValue {

    @Value("${app.config.variavel}")
    private String variavel;

    public void imprimirValue() {
        System.out.println("Valor da variavel: " + variavel);
    }

}
