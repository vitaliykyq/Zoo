package edu.coursework.zoo.service.trainer;

import edu.coursework.zoo.model.Trainer;
import edu.coursework.zoo.repository.animal.AnimalRepository;
import edu.coursework.zoo.repository.trainer.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class TrainerServiceImpl implements ITrainerService {

    @Autowired
    TrainerRepository repository;
    @Override
    public Trainer getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Trainer create(Trainer trainer) {

        trainer.setCreated_at(new Date());
        return repository.save(trainer);
    }

    @Override
    public Trainer update(Trainer trainer) {
        trainer.setModified_at(new Date());
        return repository.save(trainer);
    }

    @Override
    public Trainer delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Trainer> getAll() {
        return repository.findAll();
    }
}
