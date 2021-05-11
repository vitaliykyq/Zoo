package edu.coursework.zoo.model;

/*
    @author:    Inessa
    @project:    Zoo
    @class:    Posterity
    @version:    1.0.0
    @since:    14.04.2021
*/

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Posterity {

    private String id;

    private Animal animal;
    private Date born;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;
}
