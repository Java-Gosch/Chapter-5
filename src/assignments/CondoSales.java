package assignments;

import java.util.Scanner;

public class CondoSales {
    public static void main{
        int choice;
        int price = 0;
        String view = null;
        Scanner input = new Scanner(System.in);

        System.out.println("What are you looking for in a view for a condo? \n 1 - Park View \n 2- Golf Course View \n 3- Lake View ");
        choice = input.nextInt();

        if (choice == 1){
            price = 150000;
            view = "Park View";
            garageSelection(price, view);
        }
        else if (choice == 2){
            price = 170000;
            view = "Golf Course";
            garageSelection(price, view);
        }
        else if (choice == 3){
            price = 210000;
            view = "Lake View";
            garageSelection(price, view);
        }
        else{
            price = 0;
            view = "You've selected an invalid view ";
            System.out.println("Try that again, except read it moron");
        }
        System.out.println("You've selected " + view + " that brings your price to $" + price);


    }
    public static void garageSelection(int price, String view) {
        Scanner input = new Scanner(System.in);
        int choice;
        int totalprice;
        String garageChoice;



        System.out.println("What type of car space? \n 1 - Garage \n 2- Parking Space \n 3- No Garage");
        choice = input.nextInt();

        if (choice == 1){
            garageChoice = "Garage";
            totalprice = price + 5000;
        }
        else if (choice == 2){
            garageChoice = "Parking Space";
            totalprice = price;
        }
        else if (choice == 3){
            garageChoice = "No Garage";
            totalprice = price;
        }

    }
}
