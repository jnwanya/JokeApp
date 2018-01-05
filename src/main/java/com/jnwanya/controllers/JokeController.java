package com.jnwanya.controllers;

import com.jnwanya.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jnwanya on
 * Fri, 05 Jan, 2018.
 */
@Controller
public class JokeController {
    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model){
        String joke = jokeService.getRandomQuote();
        model.addAttribute("joke", joke);
        return "chucknorris";
    }
}
