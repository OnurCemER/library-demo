package com.onurcem.demo.Controller;


import com.onurcem.demo.Entity.Publisher;
import com.onurcem.demo.Service.Implementation.PublisherManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringPublisherController {
    private final PublisherManager publisherManager;

    public SpringPublisherController(PublisherManager publisherManager) {
        this.publisherManager = publisherManager;
    }

    @RequestMapping("/new-publisher")
    public String newPublisher(Model model){
        Publisher publisher = new Publisher();
        model.addAttribute("publisher", publisher);
        return "new-publisher";
    }

    @RequestMapping(value = "/add-publisher", method = RequestMethod.POST)
    public String addPublisher(@ModelAttribute("publisher") Publisher publisher){
        publisherManager.save(publisher);
        return "redirect:/";
    }
}
