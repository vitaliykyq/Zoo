package edu.coursework.zoo.service.builder;

import edu.coursework.zoo.model.Builder;

import java.util.List;

public interface IBuilderService {
    Builder getById(String id);
    Builder create(Builder builder);
    Builder update(Builder builder);
    Builder delete(String id);
    List<Builder> getAll();
}
