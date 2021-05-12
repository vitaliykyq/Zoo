package edu.coursework.zoo.repository.trainer;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Trainer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends MongoRepository<Trainer, String> {
}
