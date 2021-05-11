package edu.coursework.zoo.model;

/*
    @author:    Inessa
    @project:    Zoo
    @class:    Administration
    @version:    1.0.0
    @since:    14.04.2021
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Administration {

    private String id;

    private String position;
    private String controlArea;

    private LocalDateTime created_at;
    private LocalDateTime modified_at;
    private String description;

    public Administration(String id, String position, String controlArea) {
        this.id = id;
        this.position = position;
        this.controlArea = controlArea;
        this.created_at = LocalDateTime.now();
    }
}
