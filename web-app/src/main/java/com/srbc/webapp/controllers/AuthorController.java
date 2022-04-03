package com.srbc.webapp.controllers;

import com.srbc.webapp.repositories.IAuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author esorbaci
 */

public class AuthorController {

    private IAuthorRepository authorRepository;

    public AuthorController(IAuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {

        model.addAttribute("authors", authorRepository.findAll());
        return "authors/list";
    }
}
