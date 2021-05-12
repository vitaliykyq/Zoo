package edu.coursework.zoo.repository.cleaner;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Cleaner;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CleanerRepository extends MongoRepository<Cleaner, String> {
}
