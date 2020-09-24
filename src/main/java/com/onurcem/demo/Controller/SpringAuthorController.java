package com.onurcem.demo.Controller;

import com.onurcem.demo.DTO.AuthorDto;
import com.onurcem.demo.Entity.Author;
import com.onurcem.demo.Service.Implementation.AuthorManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringAuthorController {

    private final AuthorManager authorManager;

    public SpringAuthorController(AuthorManager authorManager) {
        this.authorManager = authorManager;
    }

    @RequestMapping("/new-author")
    public String newAuthor(Model model){
        Author author = new Author();
        model.addAttribute("author", author);
        return "new-author";
    }

    @RequestMapping(value = "/add-author", method = RequestMethod.POST)
    public String addAuthor(@ModelAttribute("author") Author author){
        authorManager.save(author);
        return "redirect:/";
    }
}
