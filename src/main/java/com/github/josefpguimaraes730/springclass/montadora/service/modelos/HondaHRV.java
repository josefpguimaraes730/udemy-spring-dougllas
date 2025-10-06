package com.github.josefpguimaraes730.springclass.montadora.service.modelos;

import com.github.josefpguimaraes730.springclass.montadora.service.Carro;
import com.github.josefpguimaraes730.springclass.montadora.service.componentes.Motor;
import com.github.josefpguimaraes730.springclass.montadora.service.enums.Montadora;

public class HondaHRV extends Carro {
    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV");
        setCor("Prata");
        setMontadora(Montadora.HONDA);
    }
}
