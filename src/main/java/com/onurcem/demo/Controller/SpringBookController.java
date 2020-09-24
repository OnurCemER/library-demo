package com.onurcem.demo.Controller;

import com.onurcem.demo.DTO.BookDto;
import com.onurcem.demo.Entity.Book;
import com.onurcem.demo.Service.Implementation.BookManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class SpringBookController {
    private final BookManager bookManager;

    public SpringBookController(BookManager bookManager) {
        this.bookManager = bookManager;
    }

    @RequestMapping("/")
    public String homePage(Model model){
        List<BookDto> books = bookManager.getAll();
        model.addAttribute("bookList", books);
        return "index";
    }

    @RequestMapping("/new")
    public String newBookForm(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        return "new-book";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addBook(@ModelAttribute("book") BookDto book){
        bookManager.save(book);
        return "redirect:/";
    }

    @RequestMapping(value = "/update/{id}")
    public ModelAndView updateBook(@PathVariable(name = "id") Long id){
        ModelAndView modelAndView = new ModelAndView("update-book");
        BookDto bookDto = bookManager.getById(id);
        modelAndView.addObject("book", bookDto);
        return modelAndView;
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteBook(@PathVariable(name = "id") Long id){
        bookManager.delete(id);
        return "redirect:/";
    }
}
