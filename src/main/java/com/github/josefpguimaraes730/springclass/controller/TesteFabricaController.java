package com.github.josefpguimaraes730.springclass.controller;

import com.github.josefpguimaraes730.springclass.model.CarroStatus;
import com.github.josefpguimaraes730.springclass.model.annotations.Turbo;
import com.github.josefpguimaraes730.springclass.model.componentes.Chave;
import com.github.josefpguimaraes730.springclass.model.componentes.Motor;
import com.github.josefpguimaraes730.springclass.model.modelos.HondaHRV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
