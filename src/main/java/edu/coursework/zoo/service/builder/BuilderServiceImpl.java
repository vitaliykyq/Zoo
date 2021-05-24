package edu.coursework.zoo.service.builder;

import edu.coursework.zoo.model.Builder;
import edu.coursework.zoo.repository.builder.BuilderRepository;
import edu.coursework.zoo.repository.cleaner.CleanerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class BuilderServiceImpl implements IBuilderService {

    @Autowired
    BuilderRepository repository;
    @Override
    public Builder getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Builder create(Builder builder) {

        builder.setCreated_at(new Date());
        return repository.save(builder);
    }

    @Override
    public Builder update(Builder builder) {

        builder.setModified_at(new Date());
        return repository.save(builder);
    }

    @Override
    public Builder delete(String id) {

        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Builder> getAll() {
        return repository.findAll();
    }
}
