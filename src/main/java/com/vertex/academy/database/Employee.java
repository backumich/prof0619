package com.vertex.academy.database;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int salary;
    private String department;
}
