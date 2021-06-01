package edu.coursework.zoo.service.medical;

import edu.coursework.zoo.model.Medical;

import java.util.List;

public interface IMedicalService {
    Medical getById(String id);
    Medical create(Medical medical);
    Medical update(Medical medical);
    Medical delete(String id);
    List<Medical> getAll();
}
