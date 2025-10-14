package com.github.josefpguimaraes730.springclass.exemplos.service.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "app.config")
@Getter
@Setter
public class ApplicationProperties {
    private String variavel;
    private Integer valor;
}
