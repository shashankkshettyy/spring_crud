package com.springcrudapi.democrud.controller;

import com.springcrudapi.democrud.model.Employee;
import com.springcrudapi.democrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/employee")
    public List<Employee> get(){
       return  employeeService.get();
    }
    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee){
        employeeService.save(employee);
        return employee;

    }
    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable int id){
        Employee employee=employeeService.get(id);
        return employee;
    }
    @DeleteMapping("/employee/{id}")
    public String delete(@PathVariable int id){
        employeeService.delete(id);
        return " The Employee is deleted"+id;
    }
    @PutMapping("/employee")
    public Employee get(@RequestBody Employee employee){
       employeeService.save(employee);
       return employee;
    }

}
