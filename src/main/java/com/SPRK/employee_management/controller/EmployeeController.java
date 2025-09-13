package com.SPRK.employee_management.controller;

import com.SPRK.employee_management.entity.Employee;
import com.SPRK.employee_management.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor

public class EmployeeController {

    private final EmployeeService employeeService;


    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        Employee savedEmployees = employeeService.saveEmployees(employee);
        return savedEmployees;

    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employee/{empId}")
    public Employee getEmployee(@PathVariable("empId") String empId) {
        return employeeService.getEmployeeByEmpId(empId);
    }


}











