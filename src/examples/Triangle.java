package examples;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        //triangles bro
        //solving for right, isosceles, equilateral
        //solves triangle sides, perimeter, area
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("What are you solving for? \n 1 - for right triangle \n "
                + "2 - For isosceles \n 3 - For Equilateral \n >>>");
        choice = input.nextInt();

        if (choice == 1) {

        } else if (choice == 2) {

        } else if (choice == 3) {

        }
    }

    public static void rightTriangle() {
        Scanner input = new Scanner(System.in);
        String choice = null;
        double side1;
        double side2;
        System.out.println("Which side do you want to solve for? \n" + "A- Side\nB- Side\nC- Side");
        choice = input.next();
        if (choice.equalsIgnoreCase("A")) {

            System.out.print("Please enter for side B >>>");
            side1 = input.nextDouble();
            System.out.print("Please enter for side C >>>");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        } else if (choice.equalsIgnoreCase("B")) {

            System.out.print("Please enter for side A >>>");
            side1 = input.nextDouble();
            System.out.print("Please enter for side C >>>");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        } else {

            System.out.print("Please enter for side A >>>");
            side1 = input.nextDouble();
            System.out.print("Please enter for side C >>>");
            side2 = input.nextDouble();
            rightTriangleMathC(side1, side2, choice);
        }

    }

    public static void rightTriangleMathAB(double side1, double side2, String choice) {
        double notC;
        notC = Math.sqrt((side2 * side2) - (side1 * side1));
        System.out.println("The side " + choice + " is " + notC);


    }

    public static void rightTriangleMathC(double side1, double side2, String choice) {
        double C;
        C = Math.sqrt((side2 * side2) + (side1 * side1));
        System.out.println("The side " + choice + " is " + C);
    }

        public static void solvePerimeter(double side1, double side2, String choice, double notC, double C){

        double perimeter;
        if(choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B")){
            perimeter = side1 + side2 + notC;
            System.out.print("The perimeter of the triangle is " + perimeter);
        }
        else if(choice.equalsIgnoreCase("C"){
            {
           perimeter = side1 + side2 + C;
           System.out.print("The perimeter of the triangle is " + perimeter);
            }

        }
    }
}