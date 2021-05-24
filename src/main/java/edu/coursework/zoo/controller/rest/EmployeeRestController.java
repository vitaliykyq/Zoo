package edu.coursework.zoo.controller.rest;

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Employee;
import edu.coursework.zoo.service.animal.IAnimalServiceImpl;
import edu.coursework.zoo.service.employee.EmployeeServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/employee")
public class EmployeeRestController {
    @Autowired
    EmployeeServiceImpl service;

    @GetMapping("/get/all")
    public List<Employee> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Employee getById(@PathVariable("id") String id){
        return service.getById(id);
    }


    @GetMapping("/delete/{id}")
    public Employee deleteById(@PathVariable("id")  String id){
        return service.delete(id);
    }


    @PostMapping("/create/")
    public Employee create(@RequestBody Employee employee){
        return service.create(employee);
    }


    @PostMapping ("/update/")
    public Employee update(@RequestBody Employee employee){
        return service.update(employee);
    }
}
