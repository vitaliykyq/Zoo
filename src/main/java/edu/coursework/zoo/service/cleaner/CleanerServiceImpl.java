package edu.coursework.zoo.service.cleaner;

import edu.coursework.zoo.model.Administration;
import edu.coursework.zoo.model.Cleaner;
import edu.coursework.zoo.repository.animal.AnimalRepository;
import edu.coursework.zoo.repository.cleaner.CleanerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CleanerServiceImpl implements ICleanerService {

    @Autowired
    CleanerRepository repository;

    @Override
    public Cleaner getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Cleaner create(Cleaner cleaner) {

        cleaner.setCreated_at(new Date());
        return repository.save(cleaner);
    }

    @Override
    public Cleaner update(Cleaner cleaner) {

        cleaner.setModified_at(new Date());
        return repository.save(cleaner);
    }

    @Override
    public Cleaner delete(String id) {

        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Cleaner> getAll() {
        return repository.findAll();
    }
}
