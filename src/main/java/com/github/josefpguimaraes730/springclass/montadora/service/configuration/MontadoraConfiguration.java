package com.github.josefpguimaraes730.springclass.montadora.service.configuration;

import com.github.josefpguimaraes730.springclass.montadora.service.componentes.Motor;
import com.github.josefpguimaraes730.springclass.montadora.service.enums.TipoMotor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;


@Configuration
public class MontadoraConfiguration {

    @Bean
    @Primary
    @Scope(BeanDefinition.SCOPE_SINGLETON) //Unica instancia para o contexto spring
    //@Scope(WebApplicationContext.SCOPE_APPLICATION) //Unica instancia para o contexto web (ServletContext)
    //@Scope("prototype") //Uma instancia para cada usuario
    //request //So existe dentro da requisicao
    //session //So existe dentro da sessao do usuario
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
