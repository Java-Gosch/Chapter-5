package assignments;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int numberEntered;
        System.out.println("Enter a number to see if it's odd or even");
        numberEntered = input.nextInt();
        String result;
        if(numberEntered % 2 == 0)
            result = "Even";
        else
            result = "Odd";

        System.out.println(result);



    }
}

