package edu.coursework.zoo.repository.medical;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Medical;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalRepository extends MongoRepository<Medical, String> {
}
