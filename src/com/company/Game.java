package com.company;

import java.util.Scanner;

public class Game {

    String player1;
    String player2;

    int p1;
    int p2;

    int count;


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
        while (count < 1000)
        int value1 = die1.roll();
        int value2 = die2.roll();
        System.out.println(value1);
        System.out.println(value2);
        count++;

    }

    public void start() {

        Scanner input = new Scanner(System.in);

        System.out.println( Color.ANSI_RED + "Hvad er spiller 1's navn" + Color.ANSI_RESET);
        String player1 = input.nextLine();

        System.out.println(Color.ANSI_BLUE + "Hvad er spiller 2's navn" + Color.ANSI_RESET);
        String player2 = input.nextLine();

        System.out.println(Color.ANSI_RED + player1 + Color.ANSI_RESET + " & " + Color.ANSI_BLUE + player2 + Color.ANSI_RESET);

        System.out.println(Color.ANSI_RESET);
        while (p1Score < 40 && p2Score < 40 ) {                                                                             //We create a while so the players get to take turns until one of the players fulfill the demands for winning
            System.out.println(" ");
            System.out.println("Press Enter to continue " + Color.ANSI_RED + player1 + Color.ANSI_RESET);                   //A text is printed to tell the player to press enter to continue
            String Nothing1 = input.nextLine();                                                                             //A string is created to make a simple continue mechanic
            int value1 = die1.roll();                                                                                       //The random number generator is referenced and therefore the method is used
            int value2 = die2.roll();                                                                                       //The second die is created so we can distinguish between the dice being rolled
            System.out.println(Color.ANSI_RED + player1 + Color.ANSI_RESET + ", You rolled " + value1 + " and " + value2);  //The value of the dice is being printed for the players to see
            if (value1 == 1 && value2 == 1) {                                                                               //The programme checks if the values are both 1
                p1Score = p1Score - p1Score;                                                                                //If true - The score of player 1 is reset
            } else {
                p1Score = p1Score + value1 + value2;                                                                        //If false - The value of the dice is added to the score of player 1
            }
            System.out.println(Color.ANSI_RED + player1 + Color.ANSI_RESET + " " + p1Score);                                //Player 1´s score is displayed
            System.out.println(" ");
            System.out.println("Press Enter to continue " + Color.ANSI_BLUE + player2 + Color.ANSI_RESET);                  //Player 2 is asked to press enter to continue
            String Nothing2 = input.nextLine();                                                                             //Another string is added to create the simple continue mechanic
            int value3 = die1.roll();                                                                                       //The random generator is referenced again and the method used to give die1 a value
            int value4 = die2.roll();                                                                                       //Die2 is then given a value
            System.out.println(Color.ANSI_BLUE + player2 + Color.ANSI_RESET + ", You rolled " + value3 + " and " + value4); //the numbers rolled are printed for the players to see
            if (value3 == 1 && value4 == 1) {                                                                               //The programme compares the values to check if they are both 1
                p2Score = p2Score - p2Score;                                                                                //If true - The given players score is reset
            } else {
                p2Score = p2Score + value3 + value4;                                                                        //If false - The values are added to the score of player 2
            }
            System.out.println(Color.ANSI_BLUE + player2 + Color.ANSI_RESET + " " + p2Score);
        }
        if (p1Score == p2Score){                                                                                            //When the while loop is broken the scores of the players are checked to see if they are the same
            System.out.println("Its a Tie");                                                                                //If both scores are equal - Its a tie, printed for the players to see
        } else if(p1Score > p2Score){                                                                                       //We then see if player 1´s score is bigger than player 2´s score
            System.out.println( Color.ANSI_RED_BACKGROUND);
            System.out.println(Color.ANSI_RESET + "Congratulations, " + player1 + " you are the winner");                   //If true - Player 1 is the winner
            System.out.println( Color.ANSI_RED_BACKGROUND);
        } else {
            System.out.println(Color.ANSI_BLUE_BACKGROUND);
            System.out.println(Color.ANSI_RESET + "Congratulations, " + player2 + " you are the winner");                   //If false - Player 2 is the winner
            System.out.println(Color.ANSI_BLUE_BACKGROUND);
        }

    }

}


