package edu.coursework.zoo.controller.rest;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.service.animal.AnimalServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Animal controler API")
@RestController
@RequestMapping("api/animals")
public class AnimalRestController {
    @Autowired
    AnimalServiceImpl service;

    @GetMapping("/get/all")
    public List<Animal> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Animal getById(@PathVariable("id") String id){
        return service.getById(id);
    }


    @GetMapping("/delete/{id}")
    public Animal deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }


    @PostMapping("/create/")
    public Animal create(@RequestBody Animal animal){
        return service.create(animal);
    }


    @PostMapping ("/update/")
    public Animal update(@RequestBody Animal animal){
        return service.update(animal);
    }
}
