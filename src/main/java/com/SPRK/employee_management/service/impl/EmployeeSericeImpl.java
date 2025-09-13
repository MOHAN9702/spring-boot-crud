package com.SPRK.employee_management.service.impl;

import com.SPRK.employee_management.entity.Employee;
import com.SPRK.employee_management.repository.EmployeeRepository;
import com.SPRK.employee_management.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeSericeImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployees(Employee employee) {
        Employee dbEmployee = employeeRepository.save(employee);
        return dbEmployee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeByEmpId(String empId) {
        return employeeRepository.findByEmpId(empId);
    }

}


//    @Override
//    public Employee getEmployeeByEmpId(String empId) {
//        return employeeRepository.findByEmpId(empId);
//    }



