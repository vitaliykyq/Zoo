package edu.coursework.zoo.service.exchange;

import edu.coursework.zoo.model.Administration;
import edu.coursework.zoo.model.Exchange;
import edu.coursework.zoo.repository.animal.AnimalRepository;
import edu.coursework.zoo.repository.exchange.ExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ExchangeServiceImpl implements IExchangeService {

    @Autowired
    ExchangeRepository repository;
    @Override
    public Exchange getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Exchange create(Exchange exchange) {

        exchange.setCreated_at(new Date());
        return repository.save(exchange);
    }

    @Override
    public Exchange update(Exchange exchange) {

        exchange.setModified_at(new Date());
        return repository.save(exchange);
    }

    @Override
    public Exchange delete(String id) {

        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Exchange> getAll() {
        return repository.findAll();
    }
}
