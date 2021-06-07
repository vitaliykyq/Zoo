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
import edu.coursework.zoo.model.Trainer;
import edu.coursework.zoo.service.animal.AnimalServiceImpl;
import edu.coursework.zoo.service.employee.EmployeeServiceImpl;
import edu.coursework.zoo.service.trainer.TrainerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/trainer")
@Controller
public class TrainerUIController {

    @Autowired
    TrainerServiceImpl trainerService;

    @Autowired
    AnimalServiceImpl animalService;

    @Autowired
    EmployeeServiceImpl employeeService;

    @RequestMapping("/get/all")
    public String showAll(Model model){

        List<Trainer> trainerList = trainerService.getAll();
        model.addAttribute("trainerList", trainerList);

        return "trainer/trainerList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Trainer trainer = trainerService.getById(id);
        model.addAttribute("trainer", trainer);

        List<Animal> animalListId = animalService.getAll();
        model.addAttribute("animalListId", animalListId);

        List<Employee> employeeListId = employeeService.getAll();
        model.addAttribute("employeeListId", employeeListId);
        return "trainer/updateTrainer";
    }

    @GetMapping("/showNewForm")
    public String showNewForm(Model model) {
        Trainer trainer = new Trainer();
        model.addAttribute("trainer", trainer);

        List<Animal> animalListId = animalService.getAll();
        model.addAttribute("animalListId", animalListId);

        List<Employee> employeeListId = employeeService.getAll();
        model.addAttribute("employeeListId", employeeListId);
        return "trainer/newTrainer";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("employee") @RequestBody Trainer trainer) {
        model.addAttribute("trainer", trainerService.create(trainer));
        return "redirect:/ui/trainer/get/all";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("employee") @RequestBody Trainer trainer) {

        trainerService.update(trainer);
        return "redirect:/ui/trainer/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        trainerService.delete(id);
        return "redirect:/ui/trainer/get/all";
    }
}
