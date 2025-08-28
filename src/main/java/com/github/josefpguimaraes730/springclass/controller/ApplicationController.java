package com.github.josefpguimaraes730.springclass.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/base")
public class ApplicationController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring. Application is active.";
    }
}
