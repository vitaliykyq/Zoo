package edu.coursework.zoo.service.feed.impls;

/*
    @author:    Inessa
    @project:    Zoo 
    @class:    AdministrationServiceImpl 
    @version:    1.0.0 
    @since:    14.04.2021     
*/

import edu.coursework.zoo.dao.feed.impls.FeedDAOImpl;
import edu.coursework.zoo.data.FakeData;
import edu.coursework.zoo.model.Feed;
import edu.coursework.zoo.service.feed.interfaces.IFeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedServiceImpl implements IFeedService {

    @Autowired
    FakeData fakeData;

    @Autowired
    FeedDAOImpl dao;

    @Override
    public Feed getById(String id) {

        return dao.getById(id);
    }

    @Override
    public Feed create(Feed feed) {

        return dao.create(feed);
    }

    @Override
    public Feed update(Feed feed) {

        return dao.update(feed);
    }

    @Override
    public Feed delete(String id) {

        return dao.delete(id);
    }

    @Override
    public Feed save(Feed feed) {
        return null;
    }

    @Override
    public List<Feed> getAll() {

        return fakeData.getFeedList();
    }
}
