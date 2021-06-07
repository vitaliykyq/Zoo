package edu.coursework.zoo.controller.rest;

import edu.coursework.zoo.model.Provider;


import edu.coursework.zoo.service.provider.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/providers")
public class ProviderRestController {
    @Autowired
    ProviderServiceImpl service;

    @GetMapping("/get/all")
    public List<Provider> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Provider getById(@PathVariable("id") String id){
        return service.getById(id);
    }


    @GetMapping("/delete/{id}")
    public Provider deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }


    @PostMapping("/create/")
    public Provider create(@RequestBody Provider provider){
        return service.create(provider);
    }


    @PostMapping ("/update/")
    public Provider update(@RequestBody Provider provider){
        return service.update(provider);
    }
}
