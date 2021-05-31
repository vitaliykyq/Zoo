package edu.coursework.zoo.controller.ui;


import edu.coursework.zoo.model.Feed;
import edu.coursework.zoo.model.Provider;
import edu.coursework.zoo.service.feed.FeedServiceImpl;
import edu.coursework.zoo.service.provider.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/providers")
@Controller
public class ProviderUiController {

    @Autowired
    ProviderServiceImpl service;


    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Provider> providers = service.getAll();
        model.addAttribute("provider",providers);
        return "providers/provider-page";
    }

    @GetMapping("/showNewProviderForm")
    public String showNewFeedForm(Model model) {
        // create model attribute to bind form data
        Provider provider = new Provider();
        model.addAttribute("provider", provider);

        return "providers/new_provider";
    }
    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable(value="id") String id, Model model){
        Provider provider = service.getById(id);
        model.addAttribute("provider",provider);

        return "providers/update_provider";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("provider") @RequestBody Provider provider) {
        service.update(provider);
        return "redirect:/ui/providers/get/all";
    }
    @PostMapping("/add")
    public String addStadium(Model model, @ModelAttribute("provider") @RequestBody Provider provider) {

        model.addAttribute("feed",service.create(provider));
        return "redirect:/ui/providers/get/all";

    }



    @GetMapping("/delete/{id}")
    public String delete(@PathVariable (value = "id") String id) {
        // call delete employee method
        this.service.delete(id);
        return "redirect:/ui/providers/get/all";
    }
}
