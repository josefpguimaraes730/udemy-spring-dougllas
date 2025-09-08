package com.github.josefpguimaraes730.springclass.model.componentes;

import com.github.josefpguimaraes730.springclass.model.enums.Montadora;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Chave {
    private Montadora montadora;
    private String tipo;

}
