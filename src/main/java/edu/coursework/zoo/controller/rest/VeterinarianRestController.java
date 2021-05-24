package edu.coursework.zoo.controller.rest;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Veterinarian;
import edu.coursework.zoo.service.animal.IAnimalServiceImpl;
import edu.coursework.zoo.service.veterinarian.VeterinarianServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/veterinarians")
public class VeterinarianRestController {
    @Autowired
    VeterinarianServiceImpl service;

    @GetMapping("/get/all")
    public List<Veterinarian> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Veterinarian getById(@PathVariable("id") String id){
        return service.getById(id);
    }


    @GetMapping("/delete/{id}")
    public Veterinarian deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }


    @PostMapping("/create/")
    public Veterinarian create(@RequestBody Veterinarian veterinarian){
        return service.create(veterinarian);
    }


    @PostMapping ("/update/")
    public Veterinarian update(@RequestBody Veterinarian veterinarian){
        return service.update(veterinarian);
    }
}
