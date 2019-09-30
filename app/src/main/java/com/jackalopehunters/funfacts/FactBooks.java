package com.jackalopehunters.funfacts;

import java.util.Random;

public class FactBooks {

    public String getFacts() {
        String[] facts =
                {"Cats use their long tails to balance themselves when they're jumping or walking along narrow ledges.",
                        "Cats walk like camels and giraffes: They move both of their right feet first, then move both of their left feet.",
                        "Cats' rough tongues can lick a bone clean of any shred of meat.",
                        "Cats can jump up to six times their length.",
                        "Cats' claws all curve downward, which means that they can't climb down trees head-first. ",
                        "Cats have 230 bones, while humans only have 206.",
                        "A cat's whiskers are generally about the same width as its body.",
                        "Cats have nearly twice the amount of neurons in their cerebral cortex as dogs.",
                        "Cats use their whiskers to feel the world around them in an effort to determine which small spaces they can fit into.",
                        "Male cats are more likely to be left-pawed, while female cats are more likely to be right-pawed.",
                        "Some cats can swim."};
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);

        return facts[randomNumber];


    }

}