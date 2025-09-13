package com.SPRK.employee_management.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String empId;
    private String firstName;
    private String lastName;

    private String email;
    private String department;

    private Date dateOfJoining;
    private Date dateOfBirth;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;



}
