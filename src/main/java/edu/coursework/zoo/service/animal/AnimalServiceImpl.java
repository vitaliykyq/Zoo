package edu.coursework.zoo.service.animal;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.repository.animal.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AnimalServiceImpl implements IAnimalService {

    @Autowired
    AnimalRepository repository;
    @Override
    public Animal getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Animal create(Animal animal) {
        animal.setCreated_at(new Date());
        return repository.save(animal);
    }

    @Override
    public Animal update(Animal animal) {
        animal.setModified_at(new Date());
        return repository.save(animal);
    }

    @Override
    public Animal delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Animal> getAll() {
        return repository.findAll();
    }
}
