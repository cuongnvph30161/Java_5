package com.example.demo.dao;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> finAll();
    Employee findById(int theId);
    Employee save(Employee employee);
    void deleteById(int theId);
}
