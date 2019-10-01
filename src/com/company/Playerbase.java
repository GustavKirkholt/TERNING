package com.company;

public class Playerbase {

    String name;
    int score;

    public Playerbase(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        int i = 5;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
