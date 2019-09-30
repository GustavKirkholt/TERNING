package com.company;

import java.util.Random;

public class Die {
    private final int MAX = 6;
    private int faceValue;

    public Die() {
        faceValue = roll();
    }

    public int getFaceValue() {
        return faceValue;
    }

    public int roll() {
        // Math.random(5) + 1;

        Random diceRoller = new Random();
        faceValue = diceRoller.nextInt(6) + 1;

        return faceValue;
    }
}