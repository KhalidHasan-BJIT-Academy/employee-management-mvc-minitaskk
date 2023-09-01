package com.employeemanagement.mvc.service;

import com.employeemanagement.mvc.model.Employee;
import com.employeemanagement.mvc.repository.EmployeeRpository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRpository employeeRpository;
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRpository.findAll();
    }
}
