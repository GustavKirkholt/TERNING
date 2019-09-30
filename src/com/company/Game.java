package com.company;

import javax.swing.*;
import java.util.Scanner;

//import static jdk.nashorn.internal.objects.Global.print;

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

    public void start() {

        Scanner input = new Scanner(System.in);

        System.out.println("Hvad er spiller 1's navn");
        String player1 = input.nextLine();

        System.out.println("Hvad er spiller 2's navn");
        String player2 = input.nextLine();

        System.out.println(player1 + " & " + player2);

        //player one enter name
        //player two enter name;

        // game start

        // while(no winner)
        while (p1Score < 40 && p2Score < 40) {
            System.out.println("Press Enter to continue " + player1);
            String Nothing1 = input.nextLine();
            int value1 = die1.roll();
            int value2 = die2.roll();
            System.out.println("You rolled " + value1 + " and " + value2);
            if (value1 == value2) {
                p1Score = p1Score - p1Score;
            } else {
                p1Score = p1Score + value1 + value2;
            }
            System.out.println(player1 + " " + p1Score);
            System.out.println("Press Enter to continue " + player2);
            String Nothing2 = input.nextLine();
            int value3 = die1.roll();
            int value4 = die2.roll();
            System.out.println("You rolled " + value3 + " and " + value4);
            if (value3 == value4) {
                p2Score = p2Score - p2Score;
            } else {
                p2Score = p2Score + value3 + value4;

            }
            System.out.println(player2 + " " + p2Score);
                // next player roll
                // check if two of the same
                // If true - reset score
                // If false - game continues
                // Add score
                // is score above max? set winner

                // end player turn
        }

        if (p1Score == p2Score){
            System.out.println("Its a Tie");
        } else if(p1Score > p2Score){
            System.out.println("Congratulations, " + player1 + " you are the winner");
        } else {
            System.out.println("Congratulations, " + player2 + " you are the winner");
        }

    }

}


