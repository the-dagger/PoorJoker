package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeTeller {

    static List<String> jokes = new ArrayList<>();
    static Random random = new Random();

    static {
        jokes.add("If the Silver Surfer and Iron Man team up, they'd be alloys.");
        jokes.add("If you're not part of the solution, you're part of the precipitate.");
        jokes.add("Organic chemistry is difficult. Those who study it have alkynes of trouble.");
        jokes.add("I had to make these bad chemistry jokes because all the good ones Argon.");
        jokes.add("The name's Bond. Ionic Bond. Taken, not shared.");
        jokes.add("What kind of shoes do ninjas wear? Sneakers.");
        jokes.add("Why was six afraid of seven? Because seven was a well known six offender.");
        jokes.add("What did Jay-Z call his girlfriend before they got married? Feyoncé.");
        jokes.add("I started a band called 999 Megabytes — we haven’t gotten a gig yet.");
        jokes.add("Why can’t a bike stand on its own? It’s two tired.");
        jokes.add("Alcohol is a perfect solvent: It dissolves marriages, families and careers.");
        jokes.add("Harshit Dwivedi");
    }

    public static String getJoke(){
        int index = random.nextInt(jokes.size());
        return jokes.get(index);
    }

}

