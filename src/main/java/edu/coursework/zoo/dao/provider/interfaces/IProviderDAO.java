package edu.coursework.zoo.dao.provider.interfaces;

/*
    @author:    Inessa
    @project:    Zoo 
    @class:    IAdministrationDAO 
    @version:    1.0.0 
    @since:    14.04.2021     
*/

import edu.coursework.zoo.model.Provider;

import java.util.List;

public interface IProviderDAO {

    Provider getById(String id);
    Provider create(Provider provider);
    Provider update(Provider provider);
    Provider delete(String id);
    Provider save(Provider provider);
    List<Provider> getAll();
}
