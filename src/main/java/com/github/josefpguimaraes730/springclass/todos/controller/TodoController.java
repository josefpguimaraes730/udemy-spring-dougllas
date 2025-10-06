package com.github.josefpguimaraes730.springclass.todos.controller;

import com.github.josefpguimaraes730.springclass.todos.entity.TodoEntity;
import com.github.josefpguimaraes730.springclass.todos.service.TodoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("todos")
public class TodoController {

    private TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity todo) {
        return this.service.salvar(todo);
    }

    @PutMapping("{id}")
    public TodoEntity atualizarStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity todo) {
        todo.setId(id);
        return this.service.atualizarStatus(todo);
    }

    @GetMapping
    public TodoEntity buscarPorId(Integer id) {
        return this.service.buscarPorId(id);
    }
}
