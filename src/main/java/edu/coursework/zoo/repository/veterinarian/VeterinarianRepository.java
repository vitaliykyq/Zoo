package edu.coursework.zoo.repository.veterinarian;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Veterinarian;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinarianRepository extends MongoRepository<Veterinarian, String> {
}
