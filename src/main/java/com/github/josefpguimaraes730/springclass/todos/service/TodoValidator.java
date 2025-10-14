package com.github.josefpguimaraes730.springclass.todos.service;

import com.github.josefpguimaraes730.springclass.todos.entity.TodoEntity;
import com.github.josefpguimaraes730.springclass.todos.repository.TodoRepository;
import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    //@Autowired
    private TodoRepository repository;

    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void validar(TodoEntity todo) {
        if (existeDescricao(todo.getDescricao())) {
            throw new IllegalArgumentException("Ja existe TODO com esta descricao");
        }
    }

    private boolean existeDescricao(String descricao) {
        return repository.existsByDescricao(descricao);
    }
}
