package edu.coursework.zoo.controller.rest;

import edu.coursework.zoo.model.Posterity;
import edu.coursework.zoo.service.posterity.PosterityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/posterity")
public class PosterityRestController {
    @Autowired
    PosterityServiceImpl service;

    @GetMapping("/get/all")
    public List<Posterity> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Posterity getById(@PathVariable("id") String id){
        return service.getById(id);
    }


    @GetMapping("/delete/{id}")
    public Posterity deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }


    @PostMapping("/create/")
    public Posterity create(@RequestBody Posterity posterity){
        return service.create(posterity);
    }


    @PostMapping ("/update/")
    public Posterity update(@RequestBody Posterity posterity){
        return service.update(posterity);
    }
}
