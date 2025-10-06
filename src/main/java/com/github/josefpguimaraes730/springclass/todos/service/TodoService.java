package com.github.josefpguimaraes730.springclass.todos.service;

import com.github.josefpguimaraes730.springclass.todos.entity.TodoEntity;
import com.github.josefpguimaraes730.springclass.todos.repository.TodoRepository;
import org.springframework.stereotype.Service;


@Service
public class TodoService {

    public TodoRepository todoRepository;

    //Se houver Autowired nao precisa de construtor
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
        return todoRepository.save(novoTodo);
    }

    public TodoEntity atualizarStatus(TodoEntity todo){
        return todoRepository.save(todo);
    }

    public TodoEntity buscarPorId(Integer id) {
        return todoRepository.findById(id).orElse(null);
    }
}
