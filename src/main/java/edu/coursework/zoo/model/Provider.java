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
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "provider")
public class Provider {
@Id
    private String id;

    private String name;
    private String kind;
    private String address;
    private String cooperationStartDate;
    private String cooperationFinishDate;

    private Date created_at;
    private Date modified_at;
    private String description;


}
