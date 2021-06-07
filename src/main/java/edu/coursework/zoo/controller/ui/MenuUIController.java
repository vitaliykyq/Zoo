package edu.coursework.zoo.controller.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/ui")
@Controller
public class MenuUIController {
    @RequestMapping("/menu")
    public String showAll(){
        return "menu";
    }
}