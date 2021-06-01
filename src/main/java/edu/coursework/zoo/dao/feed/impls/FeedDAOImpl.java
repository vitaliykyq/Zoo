/*
package edu.coursework.zoo.dao.feed.impls;

*/
/*
    @author:    Inessa
    @project:    Zoo 
    @class:    AdministrationImpls 
    @version:    1.0.0 
    @since:    14.04.2021     
*//*


import edu.coursework.zoo.dao.feed.interfaces.IFeedDAO;
import edu.coursework.zoo.data.FakeData;
import edu.coursework.zoo.model.Feed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository
public class FeedDAOImpl implements IFeedDAO {

    @Autowired
    FakeData fakeData;

    */
/*@Override
    public Administration getById(String id) {
        return null;
    }

    @Override
    public Administration create(Administration administration) {
        return null;
    }

    @Override
    public Administration update(Administration administration) {
        return null;
    }

    @Override
    public Administration delete(String id) {
        return null;
    }

    @Override
    public Administration save(Administration administration) {
        return null;
    }

    @Override
    public List<Administration> getAll() {
        return fakeData.getAdministrations();
    }*//*


    @Override
    public Feed getById(String id) {
        return this.getAll().stream()
                .filter(feed -> feed.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Feed create(Feed feed) {
        String id = String.valueOf(this.getAll().stream()
                .mapToInt(el->Integer.parseInt(el.getId()))
                .max().orElse(0)+1);
        feed.setCreated_at(new Date());
        feed.setId(id);
        this.getAll().add(feed);
        return feed;
    }

    @Override
    public Feed update(Feed feed) {
        Feed updatedFeed = this.getById(feed.getId());
        updatedFeed.setKind(feed.getKind());
        updatedFeed.setDateOfArrival(feed.getDateOfArrival());
        updatedFeed.setAmountOfFeed(feed.getAmountOfFeed());
        updatedFeed.setPrice(feed.getPrice());
        updatedFeed.setProvider(feed.getProvider());
        updatedFeed.setModified_at(new Date());

        return updatedFeed;

    }

    @Override
    public Feed delete(String id) {
        Feed feed = this.getById(id);
        this.getAll().remove(feed);
        return feed;
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
*/
