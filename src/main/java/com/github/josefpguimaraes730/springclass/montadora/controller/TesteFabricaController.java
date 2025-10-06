package com.github.josefpguimaraes730.springclass.montadora.controller;

import com.github.josefpguimaraes730.springclass.montadora.service.CarroStatus;
import com.github.josefpguimaraes730.springclass.montadora.service.componentes.Chave;
import com.github.josefpguimaraes730.springclass.montadora.service.componentes.Motor;
import com.github.josefpguimaraes730.springclass.montadora.service.modelos.HondaHRV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/carros")
public class TesteFabricaController {

    @Autowired
    //Default Aspirado
    //@Qualifier("motorEletrico")
    //@Turbo
    private Motor motor;

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring. Application is active.";
    }

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
