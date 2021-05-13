package edu.coursework.zoo.model;

/*
    @author:    Inessa
    @project:    Zoo
    @class:    Provider
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
public class Provider {

    private String id;

    private String name;
    private String kind;
    private String address;
    private String cooperationStartDate;
    private String cooperationFinishDate;

    private Date created_at;
    private Date modified_at;
    private String description;

    public Provider(String id, String name, String kind, String address, String cooperationStartDate,
                    String cooperationFinishDate) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.address = address;
        this.cooperationStartDate = cooperationStartDate;
        this.cooperationFinishDate = cooperationFinishDate;
        created_at = new Date();
    }
}
