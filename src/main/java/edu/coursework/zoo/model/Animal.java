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
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="animal")
public class Animal {

    private String id;

    private String kind;
    private String climaticZone;
    private Nutrition nutrition;
    private int year;
    private String gender;
    private String physicalCondition;
    private String animalArrived;
    private String animalLeft;
    private List<String> cage;
    private double weight;
    private double height;


    private Date created_at;
    private Date modified_at;
    private String description;
}
