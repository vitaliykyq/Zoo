package edu.coursework.zoo.controller.ui;

/*
    @author:    Bogdan
    @project:    Enterprises 
    @class:    BuilderUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.zoo.model.Builder;
import edu.coursework.zoo.model.Employee;
import edu.coursework.zoo.service.builder.BuilderServiceImpl;
import edu.coursework.zoo.service.employee.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/builder")
@Controller
public class BuilderUIController {

    @Autowired
    BuilderServiceImpl builderService;

    @Autowired
    EmployeeServiceImpl employeeService;

    @RequestMapping("/get/all")
    public String showAll(Model model){

        List<Builder> builderList = builderService.getAll();
        model.addAttribute("builderList", builderList);

        return "builder/builderList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Builder builder = builderService.getById(id);
        model.addAttribute("builder", builder);

        List<Employee> employeeListId = employeeService.getAll();
        model.addAttribute("employeeListId", employeeListId);
        return "builder/updateBuilder";
    }

    @GetMapping("/showNewForm")
    public String showNewForm(Model model) {
        Builder builder = new Builder();
        model.addAttribute("builder", builder);

        List<Employee> employeeListId = employeeService.getAll();
        model.addAttribute("employeeListId", employeeListId);
        return "builder/newBuilder";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("builder") @RequestBody Builder builder) {
        model.addAttribute("builder", builderService.create(builder));
        return "redirect:/ui/builder/get/all";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("builder") @RequestBody Builder builder) {

        builderService.update(builder);
        return "redirect:/ui/builder/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        builderService.delete(id);
        return "redirect:/ui/builder/get/all";
    }
}
