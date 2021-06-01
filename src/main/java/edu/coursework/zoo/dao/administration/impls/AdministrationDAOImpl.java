/*
package edu.coursework.zoo.dao.administration.impls;

*/
/*
    @author:    Inessa
    @project:    Zoo 
    @class:    AdministrationImpls 
    @version:    1.0.0 
    @since:    14.04.2021     
*//*


import edu.coursework.zoo.dao.administration.interfaces.IAdministrationDAO;
import edu.coursework.zoo.data.FakeData;
import edu.coursework.zoo.model.Administration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository
public class AdministrationDAOImpl implements IAdministrationDAO {

    @Autowired
    FakeData fakeData;

    */
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
    }*//*


    @Override
    public Administration getById(String id) {
        return this.getAll().stream()
                .filter(stadium -> stadium.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Administration create(Administration administration) {
        String id = String.valueOf(this.getAll().stream()
                .mapToInt(el->Integer.parseInt(el.getId()))
                .max().orElse(0)+1);
        administration.setCreated_at(new Date());
        administration.setId(id);
        this.getAll().add(administration);
        return administration;
    }

    @Override
    public Administration update(Administration administration) {
        Administration updatedStadium = this.getById(administration.getId());
        updatedStadium.setPosition(administration.getPosition());
        updatedStadium.setControlArea(administration.getControlArea());
        updatedStadium.setModified_at(new Date());

        return updatedStadium;

    }

    @Override
    public Administration delete(String id) {
        Administration administration = this.getById(id);
        this.getAll().remove(administration);
        return administration;
    }

    @Override
    public Administration save(Administration stadium) {
        return null;
    }

    @Override
    public List<Administration> getAll() {
        return fakeData.getAdministrations();
    }
}
*/
