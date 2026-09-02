package com.example.springboot.springbootwebmvchomeworkmodule2.advices;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class ApiError {
    private final LocalDateTime timestamp;
    private final int status;
    private final String error;
    private final   String message;
}
