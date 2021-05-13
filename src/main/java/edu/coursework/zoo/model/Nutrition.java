package edu.coursework.zoo.model;

/*
    @author:    Inessa
    @project:    Zoo
    @class:    Nutrition
    @version:    1.0.0
    @since:    14.04.2021
*/

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

@Data
public class Nutrition {

    private String id;

    private Feed feed;
    private ArrayList<Date> feedingTime;
    private String season;

    private Date created_at;
    private Date modified_at;
    private String description;
}
