package com.springcrudapi.democrud.service;


import com.springcrudapi.democrud.dao.EmployeeDao;
import com.springcrudapi.democrud.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeImplementation implements EmployeeService {

   @Autowired
   private EmployeeDao employeedao;

    @Transactional
    @Override
    public List<Employee> get() {
        return employeedao.get();
    }

    @Transactional
    @Override
    public Employee get(int id) {
        return employeedao.get(id);
    }
    @Transactional
    @Override
    public Employee save(Employee employee) {
        employeedao.save(employee);

        return employee;
    }
    @Transactional
    @Override
    public void delete(int id) {
        employeedao.delete(id);

    }
}
