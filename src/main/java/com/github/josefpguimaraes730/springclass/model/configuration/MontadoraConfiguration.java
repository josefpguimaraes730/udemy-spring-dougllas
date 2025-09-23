package com.github.josefpguimaraes730.springclass.model.configuration;

import com.github.josefpguimaraes730.springclass.model.componentes.Motor;
import com.github.josefpguimaraes730.springclass.model.enums.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean
    @Primary
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("TH-4");
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-1");
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.TURBO);
        return motor;
    }
}
