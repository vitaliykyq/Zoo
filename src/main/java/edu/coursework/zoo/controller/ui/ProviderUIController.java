package edu.coursework.zoo.controller.ui;

/*
    @author:    Bogdan
    @project:    Enterprises 
    @class:    CivilUIController 
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.zoo.model.Provider;
import edu.coursework.zoo.service.provider.impls.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RequestMapping("/ui/provider")
@Controller
public class ProviderUIController {

    @Autowired
    ProviderServiceImpl service;

    @RequestMapping("/get/all")
    public String showAll(Model model){

        List<Provider> providerList = service.getAll();
        model.addAttribute("providerList", providerList);

        return "provider/providerList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Provider provider = service.getById(id);
        model.addAttribute("provider", provider);
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
        String name = provider.getName();
        String kind = provider.getKind();
        String address = provider.getAddress();
        String cooperationStartDate = provider.getCooperationStartDate();
        String cooperationFinishDate = provider.getCooperationFinishDate();
        List<Provider> providerList = service.getAll();

        if (name != null && name.length() > 0
                && kind != null && kind.length() > 0
                && address != null && address.length() > 0
                && cooperationStartDate != null && cooperationStartDate.length() > 0
                && cooperationFinishDate != null && cooperationFinishDate.length() > 0) {
            model.addAttribute("provider", service.create(provider));
            return "redirect:/ui/provider/get/all";
        }
        return "redirect:/ui/provider/showNewForm";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("employee") @RequestBody Provider provider) {

        service.update(provider);
        return "redirect:/ui/provider/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        service.delete(id);
        return "redirect:/ui/provider/get/all";
    }
}
