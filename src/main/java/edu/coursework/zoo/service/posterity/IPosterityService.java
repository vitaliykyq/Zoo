package edu.coursework.zoo.service.posterity;

import edu.coursework.zoo.model.Administration;

import java.util.List;

public interface IPosterityService {
    Administration getById(String id);
    Administration create(Administration administration);
    Administration update(Administration administration);
    Administration delete(String id);
    List<Administration> getAll();
}
