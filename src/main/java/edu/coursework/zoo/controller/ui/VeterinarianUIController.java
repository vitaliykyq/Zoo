package edu.coursework.zoo.controller.ui;

/*
    @author:    Bogdan
    @project:    Enterprises 
    @class:    CivilUIController 
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Employee;
import edu.coursework.zoo.model.Veterinarian;
import edu.coursework.zoo.service.animal.AnimalServiceImpl;
import edu.coursework.zoo.service.employee.EmployeeServiceImpl;
import edu.coursework.zoo.service.veterinarian.VeterinarianServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/veterinarian")
@Controller
public class VeterinarianUIController {

    @Autowired
    VeterinarianServiceImpl veterinarianService;

    @Autowired
    AnimalServiceImpl animalService;

    @Autowired
    EmployeeServiceImpl employeeService;

    @RequestMapping("/get/all")
    public String showAll(Model model){

        List<Veterinarian> veterinarianList = veterinarianService.getAll();
        model.addAttribute("veterinarianList", veterinarianList);

        return "veterinarian/veterinarianList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Veterinarian veterinarian = veterinarianService.getById(id);
        model.addAttribute("veterinarian", veterinarian);

        List<Animal> animalListId = animalService.getAll();
        model.addAttribute("animalListId", animalListId);

        List<Employee> employeeListId = employeeService.getAll();
        model.addAttribute("employeeListId", employeeListId);
        return "veterinarian/updateVeterinarian";
    }

    @PostMapping("/update")
    public String update(Model model,
                         @ModelAttribute("employee") @RequestBody Veterinarian veterinarian) {

        veterinarianService.update(veterinarian);
        return "redirect:/ui/veterinarian/get/all";
    }

    @GetMapping("/showNewForm")
    public String showNewForm(Model model) {
        Veterinarian veterinarian = new Veterinarian();
        model.addAttribute("veterinarian", veterinarian);

        List<Animal> animalListId = animalService.getAll();
        model.addAttribute("animalListId", animalListId);

        List<Employee> employeeListId = employeeService.getAll();
        model.addAttribute("employeeListId", employeeListId);
        return "veterinarian/newVeterinarian";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("employee") @RequestBody Veterinarian veterinarian) {
        /*veterinarian.setCivil(civilService.getById(veterinarian.getCivil().getId()));
        veterinarian.setMilitary(militaryService.getById(veterinarian.getMilitary().getId()));
        veterinarian.setTransport(transportService.getById(veterinarian.getTransport().getId()));*/

        model.addAttribute("veterinarian", veterinarianService.create(veterinarian));
        return "redirect:/ui/veterinarian/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        veterinarianService.delete(id);
        return "redirect:/ui/veterinarian/get/all";
    }
}
