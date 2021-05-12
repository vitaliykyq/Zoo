package edu.coursework.zoo.service.exchange;

import edu.coursework.zoo.model.Administration;

import java.util.List;

public interface IExchangeService {
    Administration getById(String id);
    Administration create(Administration administration);
    Administration update(Administration administration);
    Administration delete(String id);
    List<Administration> getAll();
}
