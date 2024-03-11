package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> finAll();
    Employee findById(int theId);
    Employee save(Employee employee);
    void deleteById(int theId);
}
