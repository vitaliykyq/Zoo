package edu.coursework.zoo.service.administration.impls;

/*
    @author:    Inessa
    @project:    Zoo 
    @class:    AdministrationServiceImpl 
    @version:    1.0.0 
    @since:    14.04.2021     
*/

import edu.coursework.zoo.dao.administration.impls.AdministrationDAOImpl;
import edu.coursework.zoo.data.FakeData;
import edu.coursework.zoo.model.Administration;
import edu.coursework.zoo.service.administration.interfaces.IAdministrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrationServiceImpl implements IAdministrationService {

    @Autowired
    FakeData fakeData;

    @Autowired
    AdministrationDAOImpl dao;

    @Override
    public Administration getById(String id) {
        return null;
    }

    @Override
    public Administration create(Administration administration) {
        return null;
    }

    @Override
    public Administration update(Administration administration) {
        return null;
    }

    @Override
    public Administration delete(String id) {
        return null;
    }

    @Override
    public Administration save(Administration administration) {
        return null;
    }

    @Override
    public List<Administration> getAll() {
        return dao.getAll();
    }
}
