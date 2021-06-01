package edu.coursework.zoo.service.veterinarian;

import edu.coursework.zoo.model.Veterinarian;

import java.util.List;

public interface IVeterinarianService {
    Veterinarian getById(String id);
    Veterinarian create(Veterinarian veterinarian);
    Veterinarian update(Veterinarian veterinarian);
    Veterinarian delete(String id);
    List<Veterinarian> getAll();
}
