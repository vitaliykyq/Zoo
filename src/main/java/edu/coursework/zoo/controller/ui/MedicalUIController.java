package edu.coursework.zoo.controller.ui;

/*
    @author:    Bogdan
    @project:    Enterprises 
    @class:    CivilUIController 
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.zoo.model.Medical;
import edu.coursework.zoo.model.Provider;
import edu.coursework.zoo.model.Veterinarian;
import edu.coursework.zoo.service.medical.MedicalServiceImpl;
import edu.coursework.zoo.service.veterinarian.VeterinarianServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/medical")
@Controller
public class MedicalUIController {

    @Autowired
    MedicalServiceImpl medicalService;

    @Autowired
    VeterinarianServiceImpl veterinarianService;

    @RequestMapping("/get/all")
    public String showAll(Model model){

        List<Medical> medicalList = medicalService.getAll();
        model.addAttribute("medicalList", medicalList);

        return "medical/medicalList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Medical medical = medicalService.getById(id);
        model.addAttribute("medical", medical);

        List<Veterinarian> veterinarianListId = veterinarianService.getAll();
        model.addAttribute("veterinarianListId", veterinarianListId);
        return "medical/updateMedical";
    }

    @GetMapping("/showNewForm")
    public String showNewForm(Model model) {
        Medical medical = new Medical();
        model.addAttribute("medical", medical);

        List<Veterinarian> veterinarianListId = veterinarianService.getAll();
        model.addAttribute("veterinarianListId", veterinarianListId);
        return "medical/newMedical";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("employee") @RequestBody Medical medical) {
        /*medical.setCivil(civilService.getById(medical.getCivil().getId()));
        medical.setMilitary(militaryService.getById(medical.getMilitary().getId()));
        medical.setTransport(transportService.getById(medical.getTransport().getId()));*/

        model.addAttribute("medical", medicalService.create(medical));
        return "redirect:/ui/medical/get/all";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("employee") @RequestBody Medical medical) {

        medicalService.update(medical);
        return "redirect:/ui/medical/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        medicalService.delete(id);
        return "redirect:/ui/medical/get/all";
    }
}
