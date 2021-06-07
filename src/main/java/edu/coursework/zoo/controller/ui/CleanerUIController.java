package edu.coursework.zoo.controller.ui;

/*
    @author:    Bogdan
    @project:    Enterprises 
    @class:    CleanerUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Cleaner;
import edu.coursework.zoo.model.Employee;
import edu.coursework.zoo.service.animal.AnimalServiceImpl;
import edu.coursework.zoo.service.cleaner.CleanerServiceImpl;
import edu.coursework.zoo.service.employee.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/cleaner")
@Controller
public class CleanerUIController {

    @Autowired
    CleanerServiceImpl cleanerService;

    @Autowired
    AnimalServiceImpl animalService;

    @Autowired
    EmployeeServiceImpl employeeService;

    @RequestMapping("/get/all")
    public String showAll(Model model){

        List<Cleaner> cleanerList = cleanerService.getAll();
        model.addAttribute("cleanerList", cleanerList);

        return "cleaner/cleanerList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Cleaner cleaner = cleanerService.getById(id);
        model.addAttribute("cleaner", cleaner);

        List<Animal> animalListId = animalService.getAll();
        model.addAttribute("animalListId", animalListId);

        List<Employee> employeeListId = employeeService.getAll();
        model.addAttribute("employeeListId", employeeListId);
        return "cleaner/updateCleaner";
    }

    @GetMapping("/showNewForm")
    public String showNewForm(Model model) {
        Cleaner cleaner = new Cleaner();
        model.addAttribute("cleaner", cleaner);

        List<Animal> animalListId = animalService.getAll();
        model.addAttribute("animalListId", animalListId);

        List<Employee> employeeListId = employeeService.getAll();
        model.addAttribute("employeeListId", employeeListId);
        return "cleaner/newCleaner";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("employee") @RequestBody Cleaner cleaner) {
        model.addAttribute("cleaner", cleanerService.create(cleaner));
        return "redirect:/ui/cleaner/get/all";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("employee") @RequestBody Cleaner cleaner) {

        cleanerService.update(cleaner);
        return "redirect:/ui/cleaner/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        cleanerService.delete(id);
        return "redirect:/ui/cleaner/get/all";
    }
}
