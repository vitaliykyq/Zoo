package edu.coursework.zoo.model;

/*
    @author:    Inessa
    @project:    Zoo
    @class:    Cage
    @version:    1.0.0
    @since:    14.04.2021
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cage {

    private String id;

    private int numOfCage;
    private Date settled;
    private Date eviction;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;

    public Cage(String id, int numOfCage, Date settled, Date eviction) {
        this.id = id;
        this.numOfCage = numOfCage;
        this.settled = settled;
        this.eviction = eviction;
        this.created_at = LocalDateTime.now();
    }
}
