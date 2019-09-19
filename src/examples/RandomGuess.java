package examples;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int choice;

        int rand_pick = rand.nextInt(10) + 1;

        System.out.println("Enter a number to guess between 1 and 10 >>> ");
        choice = input.nextInt();

        if(choice == rand_pick){
            System.out.println("You were right! Good Stuff...");
        }
        else if(choice > rand_pick){
            System.out.println("Nope it was lower " + rand_pick);

        }
        else
            System.out.println("Nope it was higher " + rand_pick);




    }
}
