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

        System.out.println("Choose 1 for rock \n 2 for paper\n 3 for scissors >>>");
        choice = input.nextInt();

        if(choice == 1){
            if(enemyGuess == 1){

        }
        else if(choice == 2){

        }
        else if(choice == 3){

        }
    }
}
}
