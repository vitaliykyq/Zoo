package edu.coursework.zoo.repository.nutrition;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Nutrition;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutritionRepository extends MongoRepository<Nutrition, String> {
}
