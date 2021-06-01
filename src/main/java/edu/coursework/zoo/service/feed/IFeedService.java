package edu.coursework.zoo.service.feed;

import edu.coursework.zoo.model.Feed;

import java.util.List;

public interface IFeedService {
    Feed getById(String id);
    Feed create(Feed feed);
    Feed update(Feed feed);
    Feed delete(String id);
    List<Feed> getAll();
}
