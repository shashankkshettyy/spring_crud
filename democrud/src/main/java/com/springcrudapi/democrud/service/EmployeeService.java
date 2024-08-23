package com.springcrudapi.democrud.service;

import com.springcrudapi.democrud.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> get();
    Employee get(int id);
    Employee save(Employee employee);
    void delete(int id);
}
