package com.will.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String helloService(String name ) {
        return "Hello service dentro de service, seja bem vindo " + name;
    }
}
