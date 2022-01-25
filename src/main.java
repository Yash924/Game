import java.util.Scanner;

    class Main {
        public static void main(String[] args) {

            //Initialize the Scanner and print a welcome message
            Scanner in = new Scanner(System.in);
            System.out.println("Welcome to Rock, Paper, Scissors!");

            //Use a while(true) loop and only break the loop if the user wants to quit
            while(true) {

                //Get the user's move through user input
                System.out.println("What is your move? To make a move, enter rock, paper, or scissors. To quit the game, enter quit. ");
                String move = in.nextLine();


                //Check if the user wants to quit the game
                if(move.equals("quit")) {
                    break;
                }

                //Check if the user's move is valid (rock, paper, or scissors)
                if(!move.equals("rock") && !move.equals("paper") && !move.equals("scissors")) {

                    System.out.println("Your move isn't valid!");

                } else {

                    //Get a random number in between 0 and 3 and convert it to an integer so that the possibilities are 0, 1, or 2
                    int rand = (int)(Math.random()*3);

                    //Convert the random number to a string using conditionals and print the opponent's move
                    String opponentMove = "";
                    if(rand == 0) {
                        opponentMove = "rock";
                    } else if(rand == 1) {
                        opponentMove = "paper";
                    } else {
                        opponentMove = "scissors";
                    }
                    System.out.println("Opponent move: " + opponentMove);

                    //Print the results of the game: tie, lose, win
                    if(move.equals(opponentMove)) {
                        System.out.println("It's a tie!");
                    } else if((move.equals("rock") && opponentMove.equals("scissors")) || (move.equals("scissors") && opponentMove.equals("paper")) || (move.equals("paper") && opponentMove.equals("rock"))) {
                        System.out.println("You won!");
                    } else {
                        System.out.println("You lost!");
                    }

                }

            }


            System.out.println("Thanks for playing Rock, Paper, Scissors!");

        }
    }
