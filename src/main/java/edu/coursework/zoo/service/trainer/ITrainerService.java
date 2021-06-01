package edu.coursework.zoo.service.trainer;

import edu.coursework.zoo.model.Trainer;

import java.util.List;

public interface ITrainerService {
    Trainer getById(String id);
    Trainer create(Trainer trainer);
    Trainer update(Trainer trainer);
    Trainer delete(String id);
    List<Trainer> getAll();
}
