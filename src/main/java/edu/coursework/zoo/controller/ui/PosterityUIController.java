package edu.coursework.zoo.controller.ui;

/*
    @author:    Bogdan
    @project:    Enterprises 
    @class:    CivilUIController 
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Posterity;
import edu.coursework.zoo.service.animal.AnimalServiceImpl;
import edu.coursework.zoo.service.posterity.PosterityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/posterity")
@Controller
public class PosterityUIController {

    @Autowired
    PosterityServiceImpl posterityService;

    @Autowired
    AnimalServiceImpl animalService;

    @RequestMapping("/get/all")
    public String showAll(Model model){

        List<Posterity> posterityList = posterityService.getAll();
        model.addAttribute("posterityList", posterityList);

        return "posterity/posterityList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Posterity posterity = posterityService.getById(id);
        model.addAttribute("posterity", posterity);

        List<Animal> animalListId = animalService.getAll();
        model.addAttribute("animalListId", animalListId);
        return "posterity/updatePosterity";
    }

    @GetMapping("/showNewForm")
    public String showNewForm(Model model) {
        Posterity posterity = new Posterity();
        model.addAttribute("posterity", posterity);

        List<Animal> animalListId = animalService.getAll();
        model.addAttribute("animalListId", animalListId);
        return "posterity/newPosterity";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("employee") @RequestBody Posterity posterity) {
        model.addAttribute("posterity", posterityService.create(posterity));
        return "redirect:/ui/posterity/get/all";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("employee") @RequestBody Posterity posterity) {

        posterityService.update(posterity);
        return "redirect:/ui/posterity/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        posterityService.delete(id);
        return "redirect:/ui/posterity/get/all";
    }
}
