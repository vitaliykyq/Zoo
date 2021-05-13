package edu.coursework.zoo.model;

/*
    @author:    Inessa
    @project:    Animal
    @class:    FakeData
    @version:    1.0.0
    @since:    14.04.2021
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
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


    private Date created_at;
    private Date modified_at;
    private String description;
}
