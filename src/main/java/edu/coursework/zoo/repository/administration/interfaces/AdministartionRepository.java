package edu.coursework.zoo.repository.administration.interfaces;

/*
    @author:    Inessa
    @project:    Zoo 
    @class:    IAdministrationService 
    @version:    1.0.0 
    @since:    14.04.2021     
*/

import edu.coursework.zoo.model.Administration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdministartionRepository extends MongoRepository<Administration, String> {

}
