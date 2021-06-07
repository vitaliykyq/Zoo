package edu.coursework.zoo.controller.ui;

/*
    @author:    Bogdan
    @project:    Enterprises 
    @class:    CivilUIController 
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.zoo.model.Feed;
import edu.coursework.zoo.model.Nutrition;
import edu.coursework.zoo.model.Veterinarian;
import edu.coursework.zoo.service.feed.FeedServiceImpl;
import edu.coursework.zoo.service.nutrition.NutritionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/nutrition")
@Controller
public class NutritionUIController {

    @Autowired
    NutritionServiceImpl nutritionService;

    @Autowired
    FeedServiceImpl feedService;

    @RequestMapping("/get/all")
    public String showAll(Model model){

        List<Nutrition> nutritionList = nutritionService.getAll();
        model.addAttribute("nutritionList", nutritionList);

        return "nutrition/nutritionList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Nutrition nutrition = nutritionService.getById(id);
        model.addAttribute("nutrition",nutrition);

        List<Feed> feedListId = feedService.getAll();
        model.addAttribute("feedListId", feedListId);
        return "nutrition/updateNutrition";
    }

    @GetMapping("/showNewForm")
    public String showNewForm(Model model) {
        Nutrition nutrition = new Nutrition();
        model.addAttribute("nutrition", nutrition);

        List<Feed> feedListId = feedService.getAll();
        model.addAttribute("feedListId", feedListId);
        return "nutrition/newNutrition";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("employee") @RequestBody Nutrition nutrition) {
        model.addAttribute("nutrition", nutritionService.create(nutrition));
        return "redirect:/ui/nutrition/get/all";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("employee") @RequestBody Nutrition nutrition) {

        nutritionService.update(nutrition);
        return "redirect:/ui/nutrition/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        nutritionService.delete(id);
        return "redirect:/ui/nutrition/get/all";
    }
}
