package com.example.springboot.springbootwebmvchomeworkmodule2.controller;

import com.example.springboot.springbootwebmvchomeworkmodule2.dto.EmployeeDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @PostMapping
    public EmployeeDTO createEmployees(@Valid @RequestBody EmployeeDTO employeeDTO) {
        return employeeDTO;
    }
}
