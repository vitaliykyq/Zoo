package edu.coursework.zoo.repository.provider;

import edu.coursework.zoo.model.Posterity;
import edu.coursework.zoo.model.Provider;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends MongoRepository<Provider, String> {
}
