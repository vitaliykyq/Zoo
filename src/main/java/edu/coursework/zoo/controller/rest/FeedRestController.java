package edu.coursework.zoo.controller.rest;
/*
    @author:    Bogdan
    @project:    Enterprises
    @class:    PlaneRestController
    @version:    1.0.0
    @since:    15.04.2021
*/

import edu.coursework.zoo.model.Feed;
import edu.coursework.zoo.service.feed.impls.FeedServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Feeds controller API")
@RestController
@RequestMapping("api/feed")
public class FeedRestController {

    @Autowired
    FeedServiceImpl service;

    @GetMapping("/get/all")
    public List<Feed> getFeed(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Feed getById(@PathVariable("id") String id){
        Feed byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public Feed deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping ("/create/")
    public Feed create(@RequestBody Feed feed){
        return service.create(feed);
    }

    @PostMapping ("/update/")
    public Feed update(@RequestBody Feed feed){
        return service.update(feed);
    }

}
