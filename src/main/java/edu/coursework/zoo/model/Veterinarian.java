package edu.coursework.zoo.model;

/*
    @author:    Inessa
    @project:    Zoo
    @class:    Veterinarian
    @version:    1.0.0
    @since:    14.04.2021
*/

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
public class Veterinarian {

    private String id;

    private ArrayList<Animal> animals;
    private ArrayList<Animal> accessToAnimals;
    private ArrayList<String> responsibilities;
    private String education;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;
}
