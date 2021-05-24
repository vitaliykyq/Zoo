package edu.coursework.zoo.controller.rest;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Cleaner;
import edu.coursework.zoo.service.animal.IAnimalServiceImpl;
import edu.coursework.zoo.service.cleaner.CleanerServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/cleaners")
public class CleanerRestController {
    @Autowired
    CleanerServiceImpl service;

    @GetMapping("/get/all")
    public List<Cleaner> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Cleaner getById(@PathVariable("id") String id){
        return service.getById(id);
    }


    @GetMapping("/delete/{id}")
    public Cleaner deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }


    @PostMapping("/create/")
    public Cleaner create(@RequestBody Cleaner Cleaner){
        return service.create(Cleaner);
    }


    @PostMapping ("/update/")
    public Cleaner update(@RequestBody Cleaner Cleaner){
        return service.update(Cleaner);
    }
}
