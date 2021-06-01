package edu.coursework.zoo.controller.ui;

/*
    @author:    Bogdan
    @project:    Enterprises 
    @class:    CivilUIController 
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.zoo.model.Feed;
import edu.coursework.zoo.model.Provider;
import edu.coursework.zoo.service.feed.FeedServiceImpl;
import edu.coursework.zoo.service.provider.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
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

        List<Provider> providerIdList = providerService.getAll();
        model.addAttribute("providerIdList", providerIdList);
        return "feed/updateFeed";
    }

    @PostMapping("/update")
    public String update(Model model,
                         @ModelAttribute("employee") @RequestBody Feed feed) {

        feed.setProvider(providerService.getAll().get(Integer.parseInt(feed.getProvider().getId()) - 1));
        feedService.update(feed);
        return "redirect:/ui/feed/get/all";
    }

    @GetMapping("/showNewForm")
    public String showNewForm(Model model) {
        Feed feed = new Feed();
        model.addAttribute("feed", feed);

        List<Provider> providerIdList = providerService.getAll();
        model.addAttribute("providerIdList", providerIdList);
        return "feed/newFeed";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("employee") @RequestBody Feed feed) {

        String kind = feed.getKind();
        String dateOfArrival = feed.getDateOfArrival();
        int amountOfFeed = feed.getAmountOfFeed();
        double price = feed.getPrice();
        feed.setProvider(providerService.getAll().get(Integer.parseInt(feed.getProvider().getId()) - 1));
        /*List<Feed> feedList = feedService.getAll();*/

        if (kind != null && kind.length() > 0
                && dateOfArrival != null && dateOfArrival.length() > 0
                && amountOfFeed > 0
                && price > 0) {
            model.addAttribute("feed", feedService.create(feed));
            return "redirect:/ui/feed/get/all";
        }
        return "redirect:/ui/feed/showNewForm";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        feedService.delete(id);
        return "redirect:/ui/feed/get/all";
    }
}
