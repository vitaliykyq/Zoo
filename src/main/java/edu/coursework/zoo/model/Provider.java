package edu.coursework.zoo.model;

/*
    @author:    Inessa
    @project:    Zoo
    @class:    Provider
    @version:    1.0.0
    @since:    14.04.2021
*/

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Provider {

    private String id;

    private String name;
    private String kind;
    private String city;
    private Date cooperationStartDate;
    private Date cooperationEndDate;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;
}
