package edu.coursework.zoo.model;

/*
    @author:    Inessa
    @project:    Zoo
    @class:    Trainer
    @version:    1.0.0
    @since:    14.04.2021
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trainer {

    private String id;

    private ArrayList<Animal> animals;
    private ArrayList<Animal> accessToAnimals;
    private ArrayList<String> trainingType;

    private Date created_at;
    private Date modified_at;
    private String description;
}
