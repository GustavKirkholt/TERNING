package com.company;

public class Game {

    String player1;
    String player2;

    int p1Score;
    int p2Score;

    int max = 40;
    Die die1;
    Die die2;

    public Game() {
        die1 = new Die();
        die2 = new Die();

    }

    public void start(){
        //player one enter name
        //player two enter name;

        // game start

        // while(no winner)
        while (p1Score < 40 || p2Score < 40);
        // next player roll
        // is winning throw?
        //set winner / add score
        // is score above max? set winner

        // end player turn
    }


}


