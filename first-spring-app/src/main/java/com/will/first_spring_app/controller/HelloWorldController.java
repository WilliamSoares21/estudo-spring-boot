package com.will.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indica que essa classe é um controller REST
@RequestMapping ("/hello-world") // Indica que essa classe escuta todas as requisições que chegam na URL /hello-world
// O controller abaixo é um RESTCONTROLLER que escuta todas as requisições que chegam na URL /hello-world
public class HelloWorldController {

    // GET / hello-world
    @GetMapping // Indica que o método abaixo responde a requisições do tipo GET
    public String helloWorld() {
        return "Hello World"; 
    }
}