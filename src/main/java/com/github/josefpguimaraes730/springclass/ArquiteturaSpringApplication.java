package com.github.josefpguimaraes730.springclass;

import com.github.josefpguimaraes730.springclass.exemplos.service.UsoValue;
import com.github.josefpguimaraes730.springclass.exemplos.service.properties.ApplicationProperties;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableConfigurationProperties
public class ArquiteturaSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ArquiteturaSpringApplication.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaSpringApplication.class);
        builder.bannerMode(Mode.OFF);
        builder.profiles("producao", "homologacao");
        builder.run(args);
        //builder.lazyInitialization(true);

        //Manipuacao de contexto deve ser apos aplicaco iniciada
        ConfigurableApplicationContext configurableApplicationContext = builder.context();
        //var produtoRepository = configurableApplicationContext.getBean("produtoRepository");

        builder.properties("spring.datasource.url=jdbc:mysql://localhost:3306/produto");
        ConfigurableEnvironment configurableEnvironemnt = configurableApplicationContext.getEnvironment();
        String applicationName = configurableEnvironemnt.getProperty("spring.application.name");
        System.out.println("Application: " + applicationName);

        UsoValue value = configurableApplicationContext.getBean(UsoValue.class);
        value.imprimirValue();

        ApplicationProperties properties = configurableApplicationContext.getBean(ApplicationProperties.class);
        System.out.println("Valor do property: " + properties.getValor());
	}

}
