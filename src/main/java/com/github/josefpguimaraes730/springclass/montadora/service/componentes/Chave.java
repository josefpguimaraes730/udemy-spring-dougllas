package com.github.josefpguimaraes730.springclass.montadora.service.componentes;

import com.github.josefpguimaraes730.springclass.montadora.service.enums.Montadora;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Chave {
    private Montadora montadora;
    private String tipo;

}
