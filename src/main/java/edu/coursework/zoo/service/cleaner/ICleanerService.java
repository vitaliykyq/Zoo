package edu.coursework.zoo.service.cleaner;

import edu.coursework.zoo.model.Cleaner;

import java.util.List;

public interface ICleanerService {
    Cleaner getById(String id);
    Cleaner create(Cleaner cleaner);
    Cleaner update(Cleaner cleaner);
    Cleaner delete(String id);
    List<Cleaner> getAll();
}
