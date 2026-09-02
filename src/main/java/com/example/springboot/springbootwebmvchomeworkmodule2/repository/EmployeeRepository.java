package com.example.springboot.springbootwebmvchomeworkmodule2.repository;

import com.example.springboot.springbootwebmvchomeworkmodule2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
