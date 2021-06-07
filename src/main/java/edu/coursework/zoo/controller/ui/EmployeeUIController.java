package edu.coursework.zoo.controller.ui;

/*
    @author:    Bogdan
    @project:    Enterprises 
    @class:    CivilUIController 
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.zoo.model.Employee;
import edu.coursework.zoo.service.employee.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/employee")
@Controller
public class EmployeeUIController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @RequestMapping("/get/all")
    public String showAll(Model model){

        List<Employee> employeeList = employeeService.getAll();
        model.addAttribute("employeeList", employeeList);

        return "employee/employeeList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Employee employee = employeeService.getById(id);
        model.addAttribute("employee", employee);
        return "employee/updateEmployee";
    }

    @GetMapping("/showNewForm")
    public String showNewForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee/newEmployee";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("employee") @RequestBody Employee employee) {
        model.addAttribute("employee", employeeService.create(employee));
        return "redirect:/ui/employee/get/all";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("employee") @RequestBody Employee employee) {

        employeeService.update(employee);
        return "redirect:/ui/employee/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        employeeService.delete(id);
        return "redirect:/ui/employee/get/all";
    }
}
