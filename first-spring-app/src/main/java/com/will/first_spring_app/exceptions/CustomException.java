package com.will.first_spring_app.exceptions;

public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
    
}
