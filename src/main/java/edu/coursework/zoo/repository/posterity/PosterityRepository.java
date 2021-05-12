package edu.coursework.zoo.repository.posterity;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Posterity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosterityRepository extends MongoRepository<Posterity, String> {
}
