package edu.coursework.zoo.service.feed;

import edu.coursework.zoo.model.Feed;
import edu.coursework.zoo.repository.feed.FeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FeedServiceImpl implements IFeedService {

    @Autowired
    FeedRepository repository;
    @Override
    public Feed getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Feed create(Feed feed) {

        feed.setCreated_at(new Date());
        return repository.save(feed);
    }

    @Override
    public Feed update(Feed feed) {
        feed.setModified_at(new Date());
        return repository.save(feed);
    }

    @Override
    public Feed delete(String id) {

        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Feed> getAll() {
        return repository.findAll();
    }
}
