package edu.coursework.zoo.controller.ui;

import edu.coursework.zoo.model.Feed;
import edu.coursework.zoo.model.Provider;
import edu.coursework.zoo.service.feed.FeedServiceImpl;
import edu.coursework.zoo.service.provider.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/ui/feeds")
@Controller
public class FeedUiController {

    @Autowired
    FeedServiceImpl service;
    @Autowired
    ProviderServiceImpl serviceProvider;


    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Feed> feeds = service.getAll();
        model.addAttribute("feed",feeds);
        return "feeds/feed-page";
    }

    @GetMapping("/showNewFeedForm")
    public String showNewFeedForm(Model model) {
        // create model attribute to bind form data
        Feed feed = new Feed();
        model.addAttribute("feed", feed);
        List<Provider> providers = serviceProvider.getAll();
        model.addAttribute("providers", providers);
        return "feeds/new_feed";
    }
    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable(value="id") String id, Model model){
        Feed feed = service.getById(id);
        model.addAttribute("feed",feed);
        List<Provider> providers = serviceProvider.getAll();
        model.addAttribute("providers", providers);
        return "feeds/update_feed";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("feed") @RequestBody Feed feed) {
        service.update(feed);
        return "redirect:/ui/feeds/get/all";
    }
    @PostMapping("/add")
    public String addStadium(Model model, @ModelAttribute("feed") @RequestBody Feed feed) {

        model.addAttribute("feed",service.create(feed));
        return "redirect:/ui/feeds/get/all";

    }



    @GetMapping("/delete/{id}")
    public String delete(@PathVariable (value = "id") String id) {

        // call delete employee method
        this.service.delete(id);
        return "redirect:/ui/coaches/get/all";
    }
}