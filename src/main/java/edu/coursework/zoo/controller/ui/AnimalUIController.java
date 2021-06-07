package edu.coursework.zoo.controller.ui;

/*
    @author:    Bogdan
    @project:    Enterprises 
    @class:    AnimalUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Medical;
import edu.coursework.zoo.model.Nutrition;
import edu.coursework.zoo.service.animal.AnimalServiceImpl;
import edu.coursework.zoo.service.medical.MedicalServiceImpl;
import edu.coursework.zoo.service.nutrition.NutritionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/animal")
@Controller
public class AnimalUIController {

    @Autowired
    AnimalServiceImpl animalService;

    @Autowired
    NutritionServiceImpl nutritionService;

    @Autowired
    MedicalServiceImpl medicalService;

    @RequestMapping("/get/all")
    public String showAll(Model model){

        List<Animal> animalList = animalService.getAll();
        model.addAttribute("animalList", animalList);

        return "animal/animalList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Animal animal = animalService.getById(id);
        model.addAttribute("animal",animal);

        List<Nutrition> nutritionListId = nutritionService.getAll();
        model.addAttribute("nutritionListId", nutritionListId);

        List<Animal> animalListId = animalService.getAll();
        model.addAttribute("animalListId", animalListId);

        List<Medical> medicalListId = medicalService.getAll();
        model.addAttribute("medicalListId", medicalListId);
        return "animal/updateAnimal";
    }

    @GetMapping("/showNewForm")
    public String showNewForm(Model model) {
        Animal animal = new Animal();
        model.addAttribute("animal", animal);

        List<Nutrition> nutritionListId = nutritionService.getAll();
        model.addAttribute("nutritionListId", nutritionListId);

        List<Animal> animalListId = animalService.getAll();
        model.addAttribute("animalListId", animalListId);

        List<Medical> medicalListId = medicalService.getAll();
        model.addAttribute("medicalListId", medicalListId);
        return "animal/newAnimal";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("employee") @RequestBody Animal animal) {
        /*animal.setBrigadier(workerService.getById(animal.getBrigadier().getId()));*/
        /*animal.setWorkerList(workerService.getById(animal.getWorkerList().g()));*/
        model.addAttribute("animal", animalService.create(animal));
        return "redirect:/ui/animal/get/all";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("employee") @RequestBody Animal animal) {

        animalService.update(animal);
        return "redirect:/ui/animal/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        animalService.delete(id);
        return "redirect:/ui/animal/get/all";
    }
}
