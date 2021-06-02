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

    @GetMapping("/get/byKind/{kind}")
    public List<Animal> getAllByKind(@PathVariable("kind") String kind){
        return service.getAllByKind(kind );
    }
    @GetMapping("/get/byAge/{year}")
    public List<Animal> getAllByYear(@PathVariable("year") int year){
        return service.getAllByYear(year) ;
    }
    @GetMapping("/get/allByHeigthIs/{height}")
    public List<Animal> getAllByHeight(@PathVariable("height") double height){
        return service.getAllByHeight(height) ;
    }
    @GetMapping("/get/allByWeigthIs/{weight}")
    public List<Animal> getAllByWeight(@PathVariable("weight") double weight){
        return service.getAllByWeight(weight) ;
    }
    @GetMapping("/get/allByWeigthLte/{weight}")
    public List<Animal> getAllByWeightLte(@PathVariable("weight") double weight){
        return service.getAllByWeightLte(weight) ;
    }
    @GetMapping("/get/allByHeigthGte/{height}")
    public List<Animal> getAllByHeightGteIs(@PathVariable("height") double height){
        return service.getAllByHeightGte(height) ;
    }
    @GetMapping("/get/allByHeigthLte/{height}")
    public List<Animal> getAllByHeightLteIs(@PathVariable("height") double height){
        return service.getAllByHeight(height) ;
    }
    @GetMapping("/get/allByWeightGte/{weight}")
    public List<Animal> getAllByWeightGte(@PathVariable("weight") double weight){
        return service.getAllByWeightGte(weight) ;
    }
    @GetMapping("/get/amountOfAnimals")
    public Object getAmountOfAnimals(){
        return service.getAmountOfAnimals() ;
    }
    @GetMapping("/get/amountOfAnimalsByKind{kind}")
    public Object getAmountOfAnimalsByKind(@PathVariable("kind") String kind){
        return service.getAmountOfAnimalsByKind(kind) ;
    }
    @GetMapping("/get/amountOfAnimalsByWeightGte")
    public Object getAmountOfAnimalsByWeightGte(@PathVariable("weight") int weight){
        return service.getAmountOfAnimalsByWeightGte(weight) ;
    }
    @GetMapping("/get/amountOfAnimalsByWeightLte")
    public Object getAmountOfAnimalsByWeightLte(@PathVariable("weight") int weight){
        return service.getAmountOfAnimalsByWeightLte(weight) ;
    }
    @GetMapping("/get/amountOfAnimalsByWeightGte")
    public Object getAmountOfAnimalsByHeightGte(@PathVariable("heihgt") int heihgt){
        return service.getAmountOfAnimalsByWeightGte(heihgt) ;
    }
    @GetMapping("/get/amountOfAnimalsByWeightLte")
    public Object getAmountOfAnimalsByHeightLte(@PathVariable("heihgt") int heihgt){
        return service.getAmountOfAnimalsByWeightLte(heihgt) ;
    }
}
