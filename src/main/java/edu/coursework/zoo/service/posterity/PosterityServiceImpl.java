package edu.coursework.zoo.service.posterity;

import edu.coursework.zoo.model.Posterity;
import edu.coursework.zoo.repository.animal.AnimalRepository;
import edu.coursework.zoo.repository.posterity.PosterityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PosterityServiceImpl implements IPosterityService {

    @Autowired
    PosterityRepository repository;
    @Override
    public Posterity getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Posterity create(Posterity posterity) {

        posterity.setCreated_at(new Date());
        return repository.save(posterity);
    }

    @Override
    public Posterity update(Posterity posterity) {

        posterity.setModified_at(new Date());
        return repository.save(posterity);
    }

    @Override
    public Posterity delete(String id) {

        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Posterity> getAll() {
        return repository.findAll();
    }
}
