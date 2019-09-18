package assignments;

import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int entry1;
        int entry2;
        int entry3;
        String result = null;
        String result1 = null;

        System.out.println("Please enter first number >>> ");
        entry1 = input.nextInt();
        System.out.println("Please enter a second number >>> ");
        entry2 = input.nextInt();
        System.out.println("Please enter the last number >>> ");
        entry3 = input.nextInt();

        if(entry1 > entry2 && entry1 > entry3) {
            if (entry2 > entry3) {
                result = "Descending order " + entry1 + " " + entry2 + " " + entry3;
                result1 = "Ascending order " + entry3 + " " + entry2 + " " + entry1;
            }

            else {
                result = "Ascending order " + entry1 + " " + entry3 + " " + entry2;
                result1 = "Descending order " + entry3 + " " + entry1 + " " + entry2;
            }

        }
        else if(entry1 < entry2 && entry2 < entry3)
        {
            if(entry1 > entry3)
            {
                result = "Ascending order " + entry3 + " " + entry1 + " " + entry2;
                result1 = "Descending order " + entry2 + " " + entry1 + " " + entry3;
            }
            else {
                result = "Ascending order " + entry2 + " " + entry3 + " " + entry1;
                result1 = "Descending order " + entry3 + " " + entry1 + " " + entry2;
            }

        }
        else if(entry3 > entry2 && entry3 > entry1)
        {
            if(entry2 > entry1)
            {
                result = "Ascending order " + entry1 + " " + entry2 + " " + entry3;
                result1 = "Descending order " + entry3 + " " + entry2 + " " + entry1;
            }
            else {
                result = "Ascending order " + entry2 + " " + entry1 + " " + entry3;
                result1 = "Descending order " + entry3 + " " + entry1 + " " + entry2;
            }

        }
        System.out.println(result + "\n"  + result1);
    }

}
