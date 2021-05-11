package edu.coursework.zoo.model;

/*
    @author:    Inessa
    @project:    Zoo
    @class:    Exchange
    @version:    1.0.0
    @since:    14.04.2021
*/

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Exchange {

    private String id;

    private String zoo;
    private Animal animal;
    private boolean isTaken;
    private Date date;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;
}
