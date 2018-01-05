package com.jnwanya.services;


import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by Jnwanya on
 * Fri, 05 Jan, 2018.
 */
@Service
public class ChuckNorrisJokeService implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;
    public ChuckNorrisJokeService() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {

        //return "This is a chucknorris jokes";
        return chuckNorrisQuotes.getRandomQuote();
    }
}
