package edu.coursework.zoo.dao.feed.interfaces;

/*
    @author:    Inessa
    @project:    Zoo 
    @class:    IAdministrationDAO 
    @version:    1.0.0 
    @since:    14.04.2021     
*/

import edu.coursework.zoo.model.Feed;

import java.util.List;

public interface IFeedDAO {

    Feed getById(String id);
    Feed create(Feed feed);
    Feed update(Feed feed);
    Feed delete(String id);
    Feed save(Feed feed);
    List<Feed> getAll();
}
