package com.will.first_spring_app.service;

import org.springframework.stereotype.Service;

import com.will.first_spring_app.exceptions.CustomException;

@Service
public class HelloWorldService {

    public String helloService(String name ) {
        if (name == null || name.isEmpty()){
            throw new CustomException("Nome não pode ser vazio");

        }
        return "Hello service dentro de service, seja bem vindo " + name;
    }
}
