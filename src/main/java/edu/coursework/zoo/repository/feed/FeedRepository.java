package edu.coursework.zoo.repository.feed;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Feed;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedRepository extends MongoRepository<Feed, String> {
}
