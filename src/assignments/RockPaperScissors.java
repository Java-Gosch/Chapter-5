package assignments;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int enemyGuess = rand.nextInt(3) + 1;
        int choice;

        System.out.println("Choose\n 1 for rock \n 2 for paper\n 3 for scissors \n>>>");
        choice = input.nextInt();

        if(choice == 1){
            if(enemyGuess == 1)
                System.out.println("You tied");
            else if(enemyGuess == 2)
                System.out.println("You lost, paper beats rock");
            else if(enemyGuess == 3)
                System.out.println("You won! rock beats scissors");
        }
        else if(choice == 2){
            if(enemyGuess == 1)
                System.out.println("You won! paper beats rock");
            else if(enemyGuess == 2)
                System.out.println("You tied");
            else if(enemyGuess == 3)
                System.out.println("You lost, scissors beats paper");
        }
        else if(choice == 3){
            if(enemyGuess == 1)
                System.out.println("You lost, rock beats scissors");
            else if(enemyGuess == 2)
                System.out.println("You won! scissors beats paper");
            else if(enemyGuess == 3)
                System.out.println("You tied");

        }
    }
}

