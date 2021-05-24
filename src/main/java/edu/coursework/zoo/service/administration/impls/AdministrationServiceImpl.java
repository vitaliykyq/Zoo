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
import edu.coursework.zoo.repository.administration.interfaces.AdministartionRepository;
import edu.coursework.zoo.service.administration.interfaces.IAdministrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AdministrationServiceImpl implements IAdministrationService {

    @Autowired
    AdministartionRepository repository;

    @Override
    public Administration getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Administration create(Administration administration) {
        administration.setCreated_at(new Date());
        return repository.save(administration);
    }

    @Override
    public Administration update(Administration administration) {
        administration.setModified_at(new Date());
        return repository.save(administration);
    }

    @Override
    public Administration delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public Administration save(Administration administration) {
        return null;
    }

    @Override
    public List<Administration> getAll() {
        return repository.findAll();
    }
}
