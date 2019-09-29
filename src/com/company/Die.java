package com.company;

import java.util.Random;

public class Die {
    private final int MAX = 6;             //Max 6 sider
    private int faceValue;                 //Hvilken side terningen viser

    public Die() {
        faceValue = roll();                     //Terningen starter på side 1 - CONSTRUCTOR
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