package edu.coursework.zoo.model;

/*
    @author:    Inessa
    @project:    Zoo
    @class:    Medical
    @version:    1.0.0
    @since:    14.04.2021
*/

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

@Data
public class Medical {

    private String id;

    private Veterinarian veterinarian;
    private ArrayList<String> vaccination;
    private ArrayList<String> animalWasSick;
    private ArrayList<String> animalIsSick;

    private Date created_at;
    private Date modified_at;
    private String description;
}
