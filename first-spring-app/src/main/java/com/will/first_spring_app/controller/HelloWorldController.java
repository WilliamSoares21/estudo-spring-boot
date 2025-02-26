package com.will.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;// Importa a anotação @Qualifier para dar nome ao bean
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.will.first_spring_app.domain.User;
import com.will.first_spring_app.service.HelloWorldService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController // Indica que essa classe é um controller REST
@RequestMapping ("/hello-world") // Indica que essa classe escuta todas as requisições que chegam na URL /hello-world
// O controller abaixo é um RESTCONTROLLER que escuta todas as requisições que chegam na URL /hello-world
public class HelloWorldController {

    @Autowired // Indica que o atributo abaixo será injetado automaticamente pelo Spring
    private HelloWorldService helloWorldService;


    @Autowired
    @Qualifier("customHelloConfiguration") // Indica que o atributo abaixo será injetado automaticamente pelo Spring
    private String helloConfiguration;

    // GET / hello-world
    @GetMapping // Indica que o método abaixo responde a requisições do tipo GET 
    public String helloWorld() {
        return helloWorldService.helloService("Will"); 
    }

    // GET / hello-world/configuration
    @GetMapping("/configuration")
    public String helloConfiguration(){
        return helloConfiguration + "Will";// Retorna a string injetada pelo bean
    }

    @PostMapping("/{id}") // Indica que o método abaixo responde a requisições do tipo POST
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum" ) String filter, @RequestBody User body) { // O método abaixo recebe um id, um filtro e um objeto do tipo User
        //return "Hello World POST " + body.getName() + id; // Retorna uma string concatenando o nome do usuário com o id
        return "Hello World POST " + filter; // Retorna uma string concatenando o nome do usuário com o id;
    }
    
}