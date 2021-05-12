package edu.coursework.zoo.repository.builder;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Builder;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuilderRepository extends MongoRepository<Builder, String> {
}
