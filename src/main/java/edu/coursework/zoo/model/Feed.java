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
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="feed")
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
}
