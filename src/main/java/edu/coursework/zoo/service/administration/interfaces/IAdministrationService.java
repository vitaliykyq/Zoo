package edu.coursework.zoo.service.administration.interfaces;

/*
    @author:    Inessa
    @project:    Zoo 
    @class:    IAdministrationService 
    @version:    1.0.0 
    @since:    14.04.2021     
*/

import edu.coursework.zoo.model.Administration;

import java.util.List;

public interface IAdministrationService {

    Administration getById(String id);
    Administration create(Administration administration);
    Administration update(Administration administration);
    Administration delete(String id);
    Administration save(Administration administration);
    List<Administration> getAll();
}
