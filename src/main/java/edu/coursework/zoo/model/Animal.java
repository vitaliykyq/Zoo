package edu.coursework.zoo.model;

/*
    @author:    Inessa
    @project:    Animal
    @class:    FakeData
    @version:    1.0.0
    @since:    14.04.2021
*/

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Animal {

    private String id;

    private String kind;
    private String climaticZone;
    private Nutrition nutrition;
    private int age;
    private String gender;
    private String physicalCondition;
    private Date animalArrived;
    private Date animalLeft;
    private Cage cage;
    private double weight;
    private double height;
    private Animal couple;
    private Posterity posterity;
    private Medical medical;


    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;
}