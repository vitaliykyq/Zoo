package edu.coursework.zoo.service.nutrition;

import edu.coursework.zoo.model.Nutrition;
import edu.coursework.zoo.repository.animal.AnimalRepository;
import edu.coursework.zoo.repository.nutrition.NutritionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class NutritionServiceImpl implements INutritionService {

    @Autowired
    NutritionRepository repository;
    @Override
    public Nutrition getById(String id) {
        return repository.findById(id).orElse(null);    }

    @Override
    public Nutrition create(Nutrition nutrition) {

        nutrition.setCreated_at(new Date());
        return repository.save(nutrition);
    }

    @Override
    public Nutrition update(Nutrition nutrition) {

        nutrition.setModified_at(new Date());
        return repository.save(nutrition);
    }

    @Override
    public Nutrition delete(String id) {

        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Nutrition> getAll() {
        return repository.findAll();
    }
}
