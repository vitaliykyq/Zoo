package edu.coursework.zoo.controller.rest;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Trainer;
import edu.coursework.zoo.service.animal.IAnimalServiceImpl;
import edu.coursework.zoo.service.trainer.TrainerServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/trainers")
public class TrainerRestController {
    @Autowired
    TrainerServiceImpl service;

    @GetMapping("/get/all")
    public List<Trainer> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Trainer getById(@PathVariable("id") String id){
        return service.getById(id);
    }


    @GetMapping("/delete/{id}")
    public Trainer deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }


    @PostMapping("/create/")
    public Trainer create(@RequestBody Trainer trainer){
        return service.create(trainer);
    }


    @PostMapping ("/update/")
    public Trainer update(@RequestBody Trainer trainer){
        return service.update(trainer);
    }
}
