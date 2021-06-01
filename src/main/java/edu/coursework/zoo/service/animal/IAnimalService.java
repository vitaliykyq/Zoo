package edu.coursework.zoo.service.animal;

import edu.coursework.zoo.model.Animal;

import java.util.List;

public interface IAnimalService {
    Animal getById(String id);
    Animal create(Animal Builder);
    Animal update(Animal Builder);
    Animal delete(String id);
    List<Animal> getAll();
}
