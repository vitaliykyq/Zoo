package edu.coursework.zoo.repository.exchange;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Exchange;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeRepository extends MongoRepository<Exchange, String> {
}
