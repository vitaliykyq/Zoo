package edu.coursework.zoo.controller.rest;

/*
    @author:    Bogdan
    @project:    Enterprises
    @class:    PlaneRestController
    @version:    1.0.0
    @since:    15.04.2021
*/

import edu.coursework.zoo.model.Provider;
import edu.coursework.zoo.service.provider.impls.ProviderServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Provider controller API")
@RestController
@RequestMapping("api/provider")
public class ProviderRestController {

    @Autowired
    ProviderServiceImpl service;

    @GetMapping("/get/all")
    public List<Provider> getProvider(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Provider getById(@PathVariable("id") String id){
        Provider byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public Provider deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping ("/create/")
    public Provider create(@RequestBody Provider provider){
        return service.create(provider);
    }

    @PostMapping ("/update/")
    public Provider update(@RequestBody Provider provider){
        return service.update(provider);
    }

}
