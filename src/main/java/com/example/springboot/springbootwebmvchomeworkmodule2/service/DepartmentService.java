package com.example.springboot.springbootwebmvchomeworkmodule2.service;

import com.example.springboot.springbootwebmvchomeworkmodule2.entity.Department;
import com.example.springboot.springbootwebmvchomeworkmodule2.exception.ResourceNotFoundException;
import org.modelmapper.ModelMapper;
import com.example.springboot.springbootwebmvchomeworkmodule2.dto.DepartmentDTO;
import com.example.springboot.springbootwebmvchomeworkmodule2.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    private final ModelMapper modelMapper;

    public List<DepartmentDTO> getAllDepts() {
        List<Department> departmentEntities = departmentRepository.findAll();
        return departmentEntities.stream()
                .map(department -> modelMapper.map(department, DepartmentDTO.class))
                .collect(Collectors.toList());
    }

    public DepartmentDTO getDeptById(Long departmentId) {
        Department departmentById = departmentRepository
                .findById(departmentId)
                .orElseThrow(() -> new ResourceNotFoundException("The department with the id: " + departmentId + " does not exists"));
        return modelMapper.map(departmentById, DepartmentDTO.class);
    }

    public DepartmentDTO createNewDept(DepartmentDTO departmentDTO) {
        Department departmentEntity = modelMapper.map(departmentDTO, Department.class);
        Department savedDepartmentEntity = departmentRepository.save(departmentEntity);
        return modelMapper.map(savedDepartmentEntity, DepartmentDTO.class);
    }

    public DepartmentDTO updateDeptById(Long departmentId, DepartmentDTO departmentDTO) {
        Department department = departmentRepository.findById(departmentId)
                .orElseThrow(() -> new ResourceNotFoundException("The department with the id: " + departmentId + " does not exists"));

        Department departmentEntity = modelMapper.map(departmentDTO, Department.class);
//        departmentEntity.setId(departmentId);
        departmentRepository.save(departmentEntity);
        return modelMapper.map(departmentEntity, DepartmentDTO.class);
    }

    public boolean deleteDepartmentById(Long departmentId) {
        boolean exists = departmentRepository.existsById(departmentId);
        if (!exists) return false;
        departmentRepository.deleteById(departmentId);
        return true;
    }
}
