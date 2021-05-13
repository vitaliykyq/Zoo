package edu.coursework.zoo.model;

/*
    @author:    Inessa
    @project:    Zoo
    @class:    Feed
    @version:    1.0.0
    @since:    14.04.2021
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feed {

    private String id;

    private String kind;
    private String dateOfArrival;
    private int amountOfFeed;
    private double price;
    private Provider provider;

    private Date created_at;
    private Date modified_at;
    private String description;

    public Feed(String id, String kind, String dateOfArrival, int amountOfFeed, double price, Provider provider) {
        this.id = id;
        this.kind = kind;
        this.dateOfArrival = dateOfArrival;
        this.amountOfFeed = amountOfFeed;
        this.price = price;
        this.provider = provider;
        created_at = new Date();
    }
}
