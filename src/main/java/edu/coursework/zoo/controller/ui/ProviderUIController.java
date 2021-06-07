package edu.coursework.zoo.controller.ui;

/*
    @author:    Bogdan
    @project:    Enterprises 
    @class:    CivilUIController 
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.zoo.model.Provider;
import edu.coursework.zoo.service.provider.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/provider")
@Controller
public class ProviderUIController {

    @Autowired
    ProviderServiceImpl providerService;

    @RequestMapping("/get/all")
    public String showAll(Model model){

        List<Provider> providerList = providerService.getAll();
        model.addAttribute("providerList", providerList);

        return "provider/providerList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Provider provider = providerService.getById(id);
        model.addAttribute("provider",provider);
        return "provider/updateProvider";
    }

    @GetMapping("/showNewForm")
    public String showNewForm(Model model) {
        Provider provider = new Provider();
        model.addAttribute("provider", provider);
        return "provider/newProvider";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("employee") @RequestBody Provider provider) {
        model.addAttribute("provider", providerService.create(provider));
        return "redirect:/ui/provider/get/all";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("employee") @RequestBody Provider provider) {

        providerService.update(provider);
        return "redirect:/ui/provider/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        providerService.delete(id);
        return "redirect:/ui/provider/get/all";
    }
}
