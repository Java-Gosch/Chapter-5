package examples;

import java.util.Scanner;

public class AgeInsultGenerator {
    public static void main(String[] args)
    {
        int age;

        Scanner input = new Scanner(System.in);
        System.out.println("What is your age? >>>");
        age = input.nextInt();

        if(age < 12){
            System.out.println("Get off the computer and go play Fortnite loser");
        }
        else if(age >= 12 && age < 19){
            System.out.println("Quit looking at my program, Gen Z moron");
        }
        else if(age >=19 && age < 25){
            System.out.println("You're a straight up loser");
        }
        else if(age >= 25 && age < 35){
            System.out.println("Shut up millennial");
        }
        else if(age >=35 && age < 45){
            System.out.println("Get back to Facebook loser");
        }
        else if(age >= 45 && age < 55){
            System.out.println("Haha, how's the midlife crisis?");
        }
        else if(age >= 55){
            System.out.println("Boomer");
        }

    }
}
