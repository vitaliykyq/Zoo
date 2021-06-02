package edu.coursework.zoo.service.provider;

import edu.coursework.zoo.model.Provider;
import edu.coursework.zoo.repository.provider.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProviderServiceImpl implements IProviderService {

    @Autowired
    ProviderRepository repository;
    @Override
    public Provider getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Provider create(Provider provider) {

        provider.setCreated_at(new Date());
        return repository.save(provider);
    }

    @Override
    public Provider update(Provider provider) {
        provider.setModified_at(new Date());
        provider.setCreated_at(repository.findById(provider.getId())
                .orElse(null)
                .getCreated_at());
        repository.save(provider);
        return provider;
    }


    @Override
    public Provider delete(String id) {

        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Provider> getAll() {

        return repository.findAll();
    }
}
