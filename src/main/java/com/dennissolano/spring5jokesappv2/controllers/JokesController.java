package com.dennissolano.spring5jokesappv2.controllers;

import com.dennissolano.spring5jokesappv2.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class JokesController {

    private JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping
    public String getJoke(Model model) {
        model.addAttribute("joke", this.jokesService.getRandomQuote());
        return ("index");
    }
}
