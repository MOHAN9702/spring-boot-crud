package com.SPRK.employee_management.service;

import com.SPRK.employee_management.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService  {


    Employee saveEmployees(Employee employee);
    List<Employee> getAllEmployees();




    Employee getEmployeeByEmpId(String empId);




}
