package com.github.josefpguimaraes730.springclass.montadora.service.componentes;

import com.github.josefpguimaraes730.springclass.montadora.service.enums.TipoMotor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Motor {
    private String modelo;
    private Integer cavalos;
    private Integer cilindros;
    private Double litragem;
    private TipoMotor tipoMotor;
}
