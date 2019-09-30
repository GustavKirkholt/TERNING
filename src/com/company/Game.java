package com.company;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.print;

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

        Scanner input = new Scanner(System.in);

        System.out.println("Hvad er spiller 1's navn");
        String username1 = input.nextLine();

        System.out.println("Hvad er spiller 2's navn");
        String username2 = input.nextLine();

        System.out.println(username1 + " & " + username2);

        //player one enter name
        //player two enter name;

        // game start

        // while(no winner)
        // next player roll
        // check if two of the same
        // If true - reset score
        // If false - game continues
        // Add score
        // is score above max? set winner

        // end player turn
    }


}


