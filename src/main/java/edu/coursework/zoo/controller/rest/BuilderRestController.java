package edu.coursework.zoo.controller.rest;

import edu.coursework.zoo.model.Builder;
import edu.coursework.zoo.service.builder.BuilderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/builders")
public class BuilderRestController {
    @Autowired
    BuilderServiceImpl service;

    @GetMapping("/get/all")
    public List<Builder> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Builder getById(@PathVariable("id") String id){
        return service.getById(id);
    }


    @GetMapping("/delete/{id}")
    public Builder deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }


    @PostMapping("/create/")
    public Builder create(@RequestBody Builder builder){
        return service.create(builder);
    }


    @PostMapping ("/update/")
    public Builder update(@RequestBody Builder builder){
        return service.update(builder);
    }
}
