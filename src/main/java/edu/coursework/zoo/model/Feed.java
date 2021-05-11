package edu.coursework.zoo.model;

/*
    @author:    Inessa
    @project:    Zoo
    @class:    Feed
    @version:    1.0.0
    @since:    14.04.2021
*/

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Feed {

    private String id;

    private String kind;
    private Date dateOfArrival;
    private int amountOfFeed;
    private double price;
    private Provider provider;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;
}
