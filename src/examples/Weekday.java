package examples;

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String day;
        String result;
        System.out.println("Enter a day of the week");
        day = input.next();

        switch (day)
        {
            case "Monday":
                result = "Reserve room for Friday meeting" ;
                break;
            case "Tuesday":
                result = "Prepare for powerpoint slides";
                break;
            case "Wednesday":
                result = "Send out meeting reminders";
                break;
            case "Thursday":
                result = "Getting ready for Football Friday";
                break;
            case "Friday":
                result = "blah blah blah";
                break;


        }



    }

}
