package edu.coursework.zoo.controller.rest;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Exchange;
import edu.coursework.zoo.service.animal.IAnimalServiceImpl;
import edu.coursework.zoo.service.exchange.ExchangeServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/exchange")
public class ExchangeRestController {
    @Autowired
    ExchangeServiceImpl service;

    @GetMapping("/get/all")
    public List<Exchange> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Exchange getById(@PathVariable("id") String id){
        return service.getById(id);
    }


    @GetMapping("/delete/{id}")
    public Exchange deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }


    @PostMapping("/create/")
    public Exchange create(@RequestBody Exchange exchange){
        return service.create(exchange);
    }


    @PostMapping ("/update/")
    public Exchange update(@RequestBody Exchange exchange){
        return service.update(exchange);
    }
}
