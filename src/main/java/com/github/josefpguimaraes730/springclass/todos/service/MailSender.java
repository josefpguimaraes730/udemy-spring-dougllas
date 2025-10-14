package com.github.josefpguimaraes730.springclass.todos.service;

import org.springframework.stereotype.Component;


@Component
public class MailSender {

    public void enviar(String mensagem) {
        System.out.println("Enviando email");
    }
}
