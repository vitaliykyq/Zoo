package edu.coursework.zoo.controller.ui;

/*
    @author:    Bogdan
    @project:    Enterprises 
    @class:    CivilUIController 
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.zoo.model.Animal;
import edu.coursework.zoo.model.Feed;
import edu.coursework.zoo.model.Provider;
import edu.coursework.zoo.service.feed.FeedServiceImpl;
import edu.coursework.zoo.service.provider.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/feed")
@Controller
public class FeedUIController {

    @Autowired
    FeedServiceImpl feedService;

    @Autowired
    ProviderServiceImpl providerService;

    @RequestMapping("/get/all")
    public String showAll(Model model){

        List<Feed> feedList = feedService.getAll();
        model.addAttribute("feedList", feedList);

        return "feed/feedList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Feed feed = feedService.getById(id);
        model.addAttribute("feed", feed);

        List<Provider> providerListId = providerService.getAll();
        model.addAttribute("providerListId", providerListId);
        return "feed/updateFeed";
    }

    @GetMapping("/showNewForm")
    public String showNewForm(Model model) {
        Feed feed = new Feed();
        model.addAttribute("feed", feed);

        List<Provider> providerListId = providerService.getAll();
        model.addAttribute("providerListId", providerListId);
        return "feed/newFeed";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("employee") @RequestBody Feed feed) {
        model.addAttribute("feed", feedService.create(feed));
        return "redirect:/ui/feed/get/all";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("employee") @RequestBody Feed feed) {

        feedService.update(feed);
        return "redirect:/ui/feed/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        feedService.delete(id);
        return "redirect:/ui/feed/get/all";
    }
}
