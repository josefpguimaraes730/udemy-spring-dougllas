package com.github.josefpguimaraes730.springclass;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class ArquiteturaSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ArquiteturaSpringApplication.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaSpringApplication.class);
        builder.bannerMode(Mode.OFF);
        builder.profiles("producao", "homologacao");
        builder.run(args);

        //Manipuacao de contexto deve ser apos aplicaco iniciada
        ConfigurableApplicationContext configurableApplicationContext = builder.context();
        //var produtoRepository = configurableApplicationContext.getBean("produtoRepository");

        builder.properties("spring.datasource.url=jdbc:mysql://localhost:3306/produto");
        ConfigurableEnvironment configurableEnvironemnt = configurableApplicationContext.getEnvironment();
        String applicationName = configurableEnvironemnt.getProperty("spring.application.name");
        System.out.println("Application: " + applicationName);
	}

}
