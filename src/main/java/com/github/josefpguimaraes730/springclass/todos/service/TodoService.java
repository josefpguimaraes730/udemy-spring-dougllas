package com.github.josefpguimaraes730.springclass.todos.service;

import com.github.josefpguimaraes730.springclass.todos.entity.TodoEntity;
import com.github.josefpguimaraes730.springclass.todos.repository.TodoRepository;
import org.springframework.stereotype.Service;


@Service
public class TodoService {

    private TodoRepository repository;
    private TodoValidator validator;
    private MailSender mailSender;

    //Se houver Autowired nao precisa de construtor
    public TodoService(TodoRepository repository,
                       TodoValidator validator,
                       MailSender mailSender) {
        this.repository = repository;
        this.validator = validator;
        this.mailSender = mailSender;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
        validator.validar(novoTodo);
        return repository.save(novoTodo);
    }

    public TodoEntity atualizarStatus(TodoEntity todo){
        TodoEntity todoEntity = repository.save(todo);
        mailSender.enviar("Todo " + todo.getDescricao() + " foi atualizado para " + (todo.getConcluido() ? "" : "nao") + " concluido");
        return todoEntity;
    }

    public TodoEntity buscarPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
