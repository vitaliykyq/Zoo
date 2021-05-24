package edu.coursework.zoo.service.posterity;

import edu.coursework.zoo.model.Administration;
import edu.coursework.zoo.model.Posterity;

import java.util.List;

public interface IPosterityService {
    Posterity getById(String id);
    Posterity create(Posterity posterity);
    Posterity update(Posterity posterity);
    Posterity delete(String id);
    List<Posterity> getAll();
}
