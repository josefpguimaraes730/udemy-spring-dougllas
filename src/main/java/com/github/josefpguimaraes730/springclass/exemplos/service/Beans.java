package com.github.josefpguimaraes730.springclass.exemplos.service;

import com.github.josefpguimaraes730.springclass.todos.entity.TodoEntity;
import com.github.josefpguimaraes730.springclass.exemplos.service.properties.ApplicationProperties;
import com.github.josefpguimaraes730.springclass.todos.service.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy
//@Lazy(false) //@Lazy(true)
@Component
@Scope("singleton")
public class Beans {

    @Autowired //Mais comum
    private TodoValidator validator;

    @Autowired
    private ApplicationProperties properties;

    @Autowired //Mais recomendado
    public Beans(TodoValidator validator) {
        this.validator = validator;
        String variavel = properties.getVariavel();
    }

    @Autowired //Menos comum, mas permite condicionar passagem de objetos para a classe.
    public void setValidator(TodoValidator validator) {
        this.validator = validator;
    }

    public void utilizar() {
        var todo = new TodoEntity();
        validator.validar(todo);
    }
}
