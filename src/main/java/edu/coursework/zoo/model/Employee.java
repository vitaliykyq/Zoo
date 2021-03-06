package edu.coursework.zoo.model;

/*
    @author:    Inessa
    @project:    Zoo
    @class:    Employee
    @version:    1.0.0
    @since:    14.04.2021
*/

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Employee {

    private String id;

    private String name;
    private int age;
    private String gender;
    private double salary;
    private Date gotAJob;
    private Date resigned;
    private Object profession;

    private Date created_at;
    private Date modified_at;
    private String description;
}
