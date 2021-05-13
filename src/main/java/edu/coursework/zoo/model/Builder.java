package edu.coursework.zoo.model;

/*
    @author:    Inessa
    @project:    Zoo
    @class:    Builder
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

public class Builder {

    private String id;

    private String typeRepairWork;
    private String workingClass;
    private double rating;

    private Date created_at;
    private Date modified_at;
    private String description;

    public Builder(String id, String typeRepairWork, String workingClass, double rating) {
        this.id = id;
        this.typeRepairWork = typeRepairWork;
        this.workingClass = workingClass;
        this.rating = rating;
        this.created_at = new Date();
    }
}
