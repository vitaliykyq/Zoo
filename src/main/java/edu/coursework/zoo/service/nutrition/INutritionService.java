package edu.coursework.zoo.service.nutrition;

import edu.coursework.zoo.model.Administration;

import java.util.List;

public interface INutritionService {
    Administration getById(String id);
    Administration create(Administration administration);
    Administration update(Administration administration);
    Administration delete(String id);
    List<Administration> getAll();
}
