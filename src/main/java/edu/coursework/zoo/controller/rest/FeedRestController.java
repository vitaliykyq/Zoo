package edu.coursework.zoo.controller.rest;

import edu.coursework.zoo.model.Feed;
import edu.coursework.zoo.service.feed.FeedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/feed")
public class FeedRestController {
    @Autowired
    FeedServiceImpl service;

    @GetMapping("/get/all")
    public List<Feed> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Feed getById(@PathVariable("id") String id){
        return service.getById(id);
    }


    @GetMapping("/delete/{id}")
    public Feed deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }


    @PostMapping("/create/")
    public Feed create(@RequestBody Feed feed){
        return service.create(feed);
    }


    @PostMapping ("/update/")
    public Feed update(@RequestBody Feed feed){
        return service.update(feed);
    }
}
