package edu.coursework.zoo.controller.ui;

/*
    @author:    Bogdan
    @project:    Enterprises 
    @class:    CivilUIController 
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Exchange;
import edu.coursework.zoo.service.animal.AnimalServiceImpl;
import edu.coursework.zoo.service.exchange.ExchangeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/exchange")
@Controller
public class ExchangeUIController {

    @Autowired
    ExchangeServiceImpl exchangeService;

    @Autowired
    AnimalServiceImpl animalService;

    @RequestMapping("/get/all")
    public String showAll(Model model){

        List<Exchange> exchangeList = exchangeService.getAll();
        model.addAttribute("exchangeList", exchangeList);

        return "exchange/exchangeList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Exchange exchange = exchangeService.getById(id);
        model.addAttribute("exchange", exchange);

        List<Animal> animalListId = animalService.getAll();
        model.addAttribute("animalListId", animalListId);
        return "exchange/updateExchange";
    }

    @GetMapping("/showNewForm")
    public String showNewForm(Model model) {
        Exchange exchange = new Exchange();
        model.addAttribute("exchange", exchange);

        List<Animal> animalListId = animalService.getAll();
        model.addAttribute("animalListId", animalListId);
        return "exchange/newExchange";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("employee") @RequestBody Exchange exchange) {
        model.addAttribute("exchange", exchangeService.create(exchange));
        return "redirect:/ui/exchange/get/all";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("employee") @RequestBody Exchange exchange) {

        exchangeService.update(exchange);
        return "redirect:/ui/exchange/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        exchangeService.delete(id);
        return "redirect:/ui/exchange/get/all";
    }
}
