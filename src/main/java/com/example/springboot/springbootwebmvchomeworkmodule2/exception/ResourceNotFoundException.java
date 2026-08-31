package com.example.springboot.springbootwebmvchomeworkmodule2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message){
        super(message);
    }
}
