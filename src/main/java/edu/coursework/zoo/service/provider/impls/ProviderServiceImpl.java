package edu.coursework.zoo.service.provider.impls;

/*
    @author:    Inessa
    @project:    Zoo 
    @class:    AdministrationServiceImpl 
    @version:    1.0.0 
    @since:    14.04.2021     
*/

import edu.coursework.zoo.dao.provider.impls.ProviderDAOImpl;
import edu.coursework.zoo.data.FakeData;
import edu.coursework.zoo.model.Provider;
import edu.coursework.zoo.service.provider.interfaces.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderServiceImpl implements IProviderService {

    @Autowired
    FakeData fakeData;

    @Autowired
    ProviderDAOImpl dao;

    @Override
    public Provider getById(String id) {

        return dao.getById(id);
    }

    @Override
    public Provider create(Provider provider) {

        return dao.create(provider);
    }

    @Override
    public Provider update(Provider provider) {

        return dao.update(provider);
    }

    @Override
    public Provider delete(String id) {

        return dao.delete(id);
    }

    @Override
    public Provider save(Provider provider) {
        return null;
    }

    @Override
    public List<Provider> getAll() {

        return fakeData.getProviderList();
    }
}
