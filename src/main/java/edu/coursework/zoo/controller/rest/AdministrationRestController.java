package edu.coursework.zoo.controller.rest;

import edu.coursework.zoo.model.Administration;
import edu.coursework.zoo.service.administration.impls.AdministrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/administration")
public class AdministrationRestController {
    @Autowired
    AdministrationServiceImpl service;

    @GetMapping("/get/all")
    public List<Administration> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Administration getById(@PathVariable("id") String id){
        return service.getById(id);
    }


    @GetMapping("/delete/{id}")
    public Administration deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }


    @PostMapping("/create/")
    public Administration create(@RequestBody Administration administration){
        return service.create(administration);
    }


    @PostMapping ("/update/")
    public Administration update(@RequestBody Administration administration){
        return service.update(administration);
    }
}
