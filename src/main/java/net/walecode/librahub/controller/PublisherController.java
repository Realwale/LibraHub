package net.walecode.librahub.controller;

import net.walecode.librahub.entity.Category;
import net.walecode.librahub.entity.Publisher;
import net.walecode.librahub.service.PublisherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PublisherController {

    private PublisherService publisherService;

    @GetMapping("/publishers")
    public String findAllPublishers(Model model){
        model.addAttribute("publishers", publisherService.findAllPublisher());
        return "publishers";
    }

    @GetMapping("/remove-publisher/{id}")
    public String deletePublisher(@PathVariable Long id, Model model){
        publisherService.deletePublisher(id);
        model.addAttribute("publishers", publisherService.findAllPublisher());
        return "publishers";
    }

    @GetMapping("/update-publisher/{id}")
    public String updatePublisher(@PathVariable Long id, Model model){
        model.addAttribute("publisher", publisherService.findPublisherById(id));
        return "update-publisher";
    }

    @PostMapping("/update-publisher/{id}")
    public String savePublisher(@PathVariable Long id, Publisher publisher, BindingResult result, Model model){
        if (result.hasErrors()){
            return "update-publisher";
        }
        publisherService.updatePublisher(publisher);
        model.addAttribute("publishers", publisherService.findAllPublisher());
        return "redirect:/publishers";
    }

    @GetMapping("/add-publisher")
    public String createPublisher(Publisher publisher){
        return "add-publisher";
    }

    @PostMapping("/save-publisher")
    public String savePublisher(Publisher publisher, BindingResult result, Model model){
        if (result.hasErrors())
            return "add-publisher";
        publisherService.createPublisher(publisher);
        model.addAttribute("publishers", publisherService.findAllPublisher());
        return "redirect:/publishers";
    }


}
