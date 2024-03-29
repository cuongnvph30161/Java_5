package com.example.demo.rest;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.finAll();
    }

    @GetMapping("/empoyees/{employeeId}")
    // theo mặc định biến đường dẫn phải giống nhau
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee theEmployee = employeeService.findById(employeeId);
        if (theEmployee == null) {
            throw new RuntimeException("Employee id not found -" + employeeId);
        }
        return theEmployee;
    }


    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee) {

        theEmployee.setId(0);
        Employee employee = employeeService.save(theEmployee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        Employee employee = employeeService.findById(employeeId);
        if (employee == null) {
            throw new RuntimeException("Employee id not found");
        }
        employeeService.deleteById(employeeId);
        return "Delete employee id" + employeeId;

    }

}
