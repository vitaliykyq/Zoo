package edu.coursework.zoo.service.provider;

import edu.coursework.zoo.model.Administration;

import java.util.List;

public interface IProviderService {
    Administration getById(String id);
    Administration create(Administration administration);
    Administration update(Administration administration);
    Administration delete(String id);
    List<Administration> getAll();
}
