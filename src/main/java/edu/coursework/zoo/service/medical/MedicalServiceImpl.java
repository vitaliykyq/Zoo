package edu.coursework.zoo.service.medical;

import edu.coursework.zoo.model.Medical;
import edu.coursework.zoo.repository.medical.MedicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MedicalServiceImpl implements IMedicalService {

    @Autowired
    MedicalRepository repository;
    @Override
    public Medical getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Medical create(Medical medical) {
        medical.setCreated_at(new Date());
        return repository.save(medical);
    }

    @Override
    public Medical update(Medical medical) {
        medical.setModified_at(new Date());
        return repository.save(medical);
    }

    @Override
    public Medical delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Medical> getAll() {
        return repository.findAll();
    }
}
