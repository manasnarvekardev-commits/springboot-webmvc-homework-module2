package com.example.springboot.springbootwebmvchomeworkmodule2.controller;

import com.example.springboot.springbootwebmvchomeworkmodule2.dto.DepartmentDTO;
import com.example.springboot.springbootwebmvchomeworkmodule2.service.DepartmentService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<List<DepartmentDTO>> getString() {
        List<DepartmentDTO> allDepts = departmentService.getAllDepts();
        return new ResponseEntity<>(allDepts, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<DepartmentDTO> createDepartment(@Valid @RequestBody DepartmentDTO departmentDTO){
        DepartmentDTO savedDepartment = departmentService.createNewDept(departmentDTO);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DepartmentDTO> updateDepartment(@PathVariable("id") Long departmentId, @Valid @RequestBody DepartmentDTO departmentDTO) {
        DepartmentDTO updatedDept = departmentService.updateDeptById(departmentId, departmentDTO);
        return new ResponseEntity<>(updatedDept, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public boolean deleteDepartment(@PathVariable("id") Long departmentId) {
        return departmentService.deleteDepartmentById(departmentId);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DepartmentDTO> getDepartmentDTO(@PathVariable("id") Long departmentId) {
        DepartmentDTO deptById = departmentService.getDeptById(departmentId);
        return new ResponseEntity<>(deptById, HttpStatus.OK);
    }
}
