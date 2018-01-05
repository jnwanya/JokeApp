package com.jnwanya.services;


import org.springframework.stereotype.Service;

/**
 * Created by Jnwanya on
 * Fri, 05 Jan, 2018.
 */
@Service
public class ChuckNorrisJokeService implements JokeService {
    @Override
    public String getRandomQuote() {
        //return guru.springframework.norris.chuck.ChuckNorrisQuotes.getRandomQuote();
        return "This is a chucknorris jokes";
    }
}
