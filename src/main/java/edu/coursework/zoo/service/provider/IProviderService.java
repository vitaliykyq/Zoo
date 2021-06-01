package edu.coursework.zoo.service.provider;

import edu.coursework.zoo.model.Provider;

import java.util.List;

public interface IProviderService {
    Provider getById(String id);
    Provider create(Provider provider);
    Provider update(Provider provider);
    Provider delete(String id);
    List<Provider> getAll();
}
