package com.luv2code.springboot.thymeleaf.controller;

import com.luv2code.springboot.thymeleaf.entity.Employee;
import com.luv2code.springboot.thymeleaf.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model theModel) {

        List<Employee> theEmployees = employeeService.findAll();
        theModel.addAttribute("employees", theEmployees);
        return "employees/list-employe";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        Employee employee = new Employee();
        theModel.addAttribute("employee", employee);
        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(
            @ModelAttribute("employee") Employee employee){
            employeeService.save(employee);
            return "redirect:/employees/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel){
     Employee theEmployee = employeeService.findById(theId);
     theModel.addAttribute("employee",theEmployee);
     return "employees/employee-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId") int theId){
        employeeService.deleteById(theId);
        return "redirect:/employees/list";
    }

}

