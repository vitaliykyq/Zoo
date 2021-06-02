package edu.coursework.zoo.service.animal;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.repository.animal.AnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static org.springframework.data.mongodb.core.aggregation.Fields.fields;

@Service
@RequiredArgsConstructor
public class AnimalServiceImpl implements IAnimalService {

    @Autowired
    AnimalRepository repository;
    private final MongoTemplate mongoTemplate;

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


    public Object getAmountOfAnimals() {
        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.count().as("numOfAnimals"));

        return mongoTemplate.aggregate(aggregation, "animal", Object.class).getMappedResults();
    }
    public Object getAmountOfAnimalsByKind(String kind) {
        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(Criteria.where("kind").is(kind)),
                Aggregation.group(fields().and("kind")).count().as("numOfAnimals"),
                Aggregation.project("numOfAnimals", "kind"));

        return mongoTemplate.aggregate(aggregation, "animal", Object.class).getMappedResults();
    }
    public Object getAmountOfAnimalsByWeightGte(int weight) {
        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(Criteria.where("weight").gte(weight)),
                Aggregation.group(fields().and("weight")).count().as("numOfAnimals"),
                Aggregation.project("numOfAnimals", "weight"));

        return mongoTemplate.aggregate(aggregation, "animal", Object.class).getMappedResults();
    }
    public Object getAmountOfAnimalsByWeightLte(int weight) {
        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(Criteria.where("weight").lte(weight)),
                Aggregation.group(fields().and("weight")).count().as("numOfAnimals"),
                Aggregation.project("numOfAnimals", "weight"));

        return mongoTemplate.aggregate(aggregation, "animal", Object.class).getMappedResults();
    }
    public Object getAmountOfAnimalsByHeightGte(int height) {
        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(Criteria.where("height").gte(height)),
                Aggregation.group(fields().and("height")).count().as("numOfAnimals"),
                Aggregation.project("numOfAnimals", "height"));

        return mongoTemplate.aggregate(aggregation, "animal", Object.class).getMappedResults();
    }
    public Object getAmountOfAnimalsByHeightLte(int height) {
        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.match(Criteria.where("height").lte(height)),
                Aggregation.group(fields().and("height")).count().as("numOfAnimals"),
                Aggregation.project("numOfAnimals", "height"));

        return mongoTemplate.aggregate(aggregation, "animal", Object.class).getMappedResults();
    }

    public List<Animal> getAllByKind (String kind){
        return repository.findAllByKindIs(kind);
    }
    public List<Animal> getAllByYear (int year){
        return repository.findAllByYearIs(year);
    }
    public List<Animal> getAllByWeight (double weight){
        return repository.findAllByWeightIs(weight);
    }
    public List<Animal> getAllByHeight(double height){
        return repository.findAllByHeigthIs(height);
    }
    public List<Animal> getAllByHeightGte(double height){
        return repository.findAllByHeightGreaterThanEqual(height);
    }
    public List<Animal> getAllByWeightGte(double weight){
        return repository.findAllByWeightGreaterThanEqual(weight);
    }
    public List<Animal> getAllByWeightLte(double weight){
        return repository.findAllByWeightLessThanEqual(weight);
    }
}
