package edu.coursework.zoo.controller.rest;

import edu.coursework.zoo.model.Medical;
import edu.coursework.zoo.service.medical.MedicalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/medical")
public class MedicalRestController {
    @Autowired
    MedicalServiceImpl service;

    @GetMapping("/get/all")
    public List<Medical> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Medical getById(@PathVariable("id") String id){
        return service.getById(id);
    }


    @GetMapping("/delete/{id}")
    public Medical deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }


    @PostMapping("/create/")
    public Medical create(@RequestBody Medical medical){
        return service.create(medical);
    }


    @PostMapping ("/update/")
    public Medical update(@RequestBody Medical medical){
        return service.update(medical);
    }
}
