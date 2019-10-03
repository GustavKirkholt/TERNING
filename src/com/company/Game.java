package com.company;

import java.util.Scanner;

public class Game {

    String player1;
    String player2;

    int p1;
    int p2;

    int p1Score;
    int p2Score;

    int max = 40;
    Die die1;
    Die die2;


    public Game() {
        die1 = new Die();
        die2 = new Die();

    }

    public void test() {
        int count = 0;
        while (count < 1000){
            int value1 = die1.roll();
            int value2 = die2.roll();
            System.out.println(Color.ANSI_GREEN + value1 + Color.ANSI_RESET);
            System.out.println(Color.ANSI_YELLOW + value2 + Color.ANSI_RESET);
            count++;
        }

    }

    public void start() {

        int p1 = 0;
        int p2 = 0;

        Scanner input = new Scanner(System.in);

        System.out.println( Color.ANSI_RED + "Hvad er spiller 1's navn" + Color.ANSI_RESET);
        String player1 = input.nextLine();

        System.out.println(Color.ANSI_BLUE + "Hvad er spiller 2's navn" + Color.ANSI_RESET);
        String player2 = input.nextLine();

        System.out.println(Color.ANSI_RED + player1 + Color.ANSI_RESET + " & " + Color.ANSI_BLUE + player2 + Color.ANSI_RESET);

        System.out.println(Color.ANSI_RESET);
        /**
         * A while loop with the winning condition
         */
        while (p1 < 1 && p2 < 1) {
            System.out.println(" ");
            System.out.println("Press Enter to continue " + Color.ANSI_RED + player1 + Color.ANSI_RESET);
            /**
             * A string to make a simple continue mechanic
             */
            String Nothing1 = input.nextLine();
            /**
             * The roll function returns a random number between 1 and 6
             */
            int value1 = die1.roll();
            int value2 = die2.roll();
            System.out.println(Color.ANSI_RED + player1 + Color.ANSI_RESET + ", You rolled " + value1 + " and " + value2);
            /**
             * The if statement series checks if two 1´s are rolled then if the two dice rolled the same number
             * apart from 1, and if so it checks if the wining conditions is fulfilled, and then breaks the loop
             * at the end of player 2´s turn.
             * If the winning condition is not fulfilled, it adds to the score
             */
            if (value1 == 1 && value2 == 1) {
                p1Score = 0;
            } else if(value1 == value2){
                if(p1Score >= 40){
                    p1++;
                }
            } else {
                p1Score = p1Score + value1 + value2;
            }
            /**
             * Below is the same code as the first segment, whereas the first segment represented player 1 the
             * code below represents player 2.
             */
            System.out.println(Color.ANSI_RED + player1 + Color.ANSI_RESET + " " + p1Score);
            System.out.println(" ");
            System.out.println("Press Enter to continue " + Color.ANSI_BLUE + player2 + Color.ANSI_RESET);
            String Nothing2 = input.nextLine();
            int value3 = die1.roll();
            int value4 = die2.roll();
            System.out.println(Color.ANSI_BLUE + player2 + Color.ANSI_RESET + ", You rolled " + value3 + " and " + value4);
            if (value3 == 1 && value4 == 1) {
                p2Score = 0;
            } else if(value3 == value4){
                if(p1Score >= 40){
                    p2++;
                }
            } else {
                p2Score = p2Score + value3 + value4;
            }
            System.out.println(Color.ANSI_BLUE + player2 + Color.ANSI_RESET + " " + p2Score);
        }
        /**
         * When the while loop is broken a series of if statements find the winner.
         * It checks if its a tie and if not it checks which player has gotten 2 similar after 40
         */
        if (p1Score == p2Score && (p1 >= 1 || p2 >=1)){
            System.out.println("Its a Tie");
        } else if(p1 == 1){
            System.out.println( Color.ANSI_RED_BACKGROUND);
            System.out.println(Color.ANSI_RESET + "Congratulations, " + player1 + " you are the winner");
            System.out.println( Color.ANSI_RED_BACKGROUND);
        } else {
            System.out.println(Color.ANSI_BLUE_BACKGROUND);
            System.out.println(Color.ANSI_RESET + "Congratulations, " + player2 + " you are the winner");
            System.out.println(Color.ANSI_BLUE_BACKGROUND);
        }

    }

}


