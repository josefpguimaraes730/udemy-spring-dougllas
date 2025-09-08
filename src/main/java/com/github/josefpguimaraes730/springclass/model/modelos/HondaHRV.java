package com.github.josefpguimaraes730.springclass.model.modelos;

import com.github.josefpguimaraes730.springclass.model.Carro;
import com.github.josefpguimaraes730.springclass.model.componentes.Motor;
import com.github.josefpguimaraes730.springclass.model.enums.Montadora;

public class HondaHRV extends Carro {
    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV");
        setCor("Prata");
        setMontadora(Montadora.HONDA);
    }
}
