package edu.coursework.zoo.service.exchange;

import edu.coursework.zoo.model.Administration;
import edu.coursework.zoo.model.Exchange;

import java.util.List;

public interface IExchangeService {
    Exchange getById(String id);
    Exchange create(Exchange exchange);
    Exchange update(Exchange exchange);
    Exchange delete(String id);
    List<Exchange> getAll();
}
