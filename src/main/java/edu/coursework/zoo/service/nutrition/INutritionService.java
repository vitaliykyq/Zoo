package edu.coursework.zoo.service.nutrition;

import edu.coursework.zoo.model.Administration;
import edu.coursework.zoo.model.Nutrition;

import java.util.List;

public interface INutritionService {
    Nutrition getById(String id);
    Nutrition create(Nutrition nutrition);
    Nutrition update(Nutrition nutrition);
    Nutrition delete(String id);
    List<Nutrition> getAll();
}
