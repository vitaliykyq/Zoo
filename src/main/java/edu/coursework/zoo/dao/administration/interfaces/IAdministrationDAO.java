package edu.coursework.zoo.dao.administration.interfaces;

/*
    @author:    Inessa
    @project:    Zoo 
    @class:    IAdministrationDAO 
    @version:    1.0.0 
    @since:    14.04.2021     
*/

import edu.coursework.zoo.model.Administration;

import java.util.List;

public interface IAdministrationDAO {

    Administration getById(String id);
    Administration create(Administration administration);
    Administration update(Administration administration);
    Administration delete(String id);
    Administration save(Administration administration);
    List<Administration> getAll();
}
