package edu.coursework.zoo.service.veterinarian;

import edu.coursework.zoo.model.Administration;

import java.util.List;

public interface IVeterinarianService {
    Administration getById(String id);
    Administration create(Administration administration);
    Administration update(Administration administration);
    Administration delete(String id);
    List<Administration> getAll();
}
