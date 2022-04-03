package com.srbc.webapp.controllers;

import com.srbc.webapp.repositories.IBookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author esorbaci
 */

@Controller
public class BookController {

    private final IBookRepository bookRepository;

    public BookController(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookRepository.findAll());

        return "books/list";
    }
}
