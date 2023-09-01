package com.employeemanagement.mvc.repository;

import com.employeemanagement.mvc.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRpository extends JpaRepository<Employee, Long> {

}
