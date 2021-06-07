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
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="provider")
public class Provider {

    private String id;

    private String name;
    private String kind;
    private String city;
    private String cooperationStartDate;
    private String cooperationEndDate;

    private Date created_at;
    private Date modified_at;
    private String description;
}
