package edu.coursework.zoo.service.veterinarian;

import edu.coursework.zoo.model.Veterinarian;
import edu.coursework.zoo.repository.veterinarian.VeterinarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VeterinarianServiceImpl implements IVeterinarianService {
    @Autowired
    VeterinarianRepository repository;
    @Override
    public Veterinarian getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Veterinarian create(Veterinarian veterinarian) {
        veterinarian.setCreated_at(new Date());
        return repository.save(veterinarian);
    }

    @Override
    public Veterinarian update(Veterinarian veterinarian) {
        veterinarian.setModified_at(new Date());
        return repository.save(veterinarian);
    }

    @Override
    public Veterinarian delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Veterinarian> getAll() {
        return repository.findAll();
    }
}
