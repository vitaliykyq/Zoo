package edu.coursework.zoo.dao.provider.impls;

/*
    @author:    Inessa
    @project:    Zoo 
    @class:    AdministrationImpls 
    @version:    1.0.0 
    @since:    14.04.2021     
*/

import edu.coursework.zoo.dao.provider.interfaces.IProviderDAO;
import edu.coursework.zoo.data.FakeData;
import edu.coursework.zoo.model.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository
public class ProviderDAOImpl implements IProviderDAO {

    @Autowired
    FakeData fakeData;

    /*@Override
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
        return fakeData.getAdministrations();
    }*/

    @Override
    public Provider getById(String id) {
        return this.getAll().stream()
                .filter(provider -> provider.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Provider create(Provider provider) {
        String id = String.valueOf(this.getAll().stream()
                .mapToInt(el->Integer.parseInt(el.getId()))
                .max().orElse(0)+1);
        provider.setCreated_at(new Date());
        provider.setId(id);
        this.getAll().add(provider);
        return provider;
    }

    @Override
    public Provider update(Provider provider) {
        Provider updatedProvider = this.getById(provider.getId());
        updatedProvider.setName(provider.getName());
        updatedProvider.setKind(provider.getKind());
        updatedProvider.setCooperationStartDate(provider.getCooperationStartDate());
        updatedProvider.setCooperationFinishDate(provider.getCooperationFinishDate());
        updatedProvider.setModified_at(new Date());

        return updatedProvider;

    }

    @Override
    public Provider delete(String id) {
        Provider provider = this.getById(id);
        this.getAll().remove(provider);
        return provider;
    }

    @Override
    public Provider save(Provider stadium) {
        return null;
    }

    @Override
    public List<Provider> getAll() {
        return fakeData.getProviderList();
    }
}
