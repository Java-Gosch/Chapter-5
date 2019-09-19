package examples;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        //triangles bro
        //solving for right, isosceles, equilateral
        //solves triangle sides and perimeter
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("What are you solving for? \n 1 - for Right triangle \n "
                + "2 - For Isosceles \n 3 - For Equilateral \n >>>");
        choice = input.nextInt();

        if (choice == 1) {
            rightTriangle();

        }

        else if (choice == 2) {

        }

        else if (choice == 3) {
            equilateralTriangle();

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
    public static void equilateralTriangle() {
        Scanner input = new Scanner(System.in);
        double side1;
        System.out.println("Please enter for side A, B and C >>>");
        side1 = input.nextDouble();
        solvePerimeter(side1, side1, side1);
    }

    public static void rightTriangleMathAB(double side1, double side2, String choice) {
        double notC;
        notC = Math.sqrt((side2 * side2) - (side1 * side1));
        System.out.println("The side " + choice + " is " + notC);
        solvePerimeter(side1, side2, notC);


    }

    public static void rightTriangleMathC(double side1, double side2, String choice) {
        double C;
        C = Math.sqrt((side2 * side2) + (side1 * side1));
        System.out.println("The side " + choice + " is " + C);
        solvePerimeter(side1, side2, C);
    }

        public static void solvePerimeter(double side1, double side2, double side3){

        double perimeter;
        perimeter = side1 + side2 + side3;

        System.out.println("The perimeter of your triangle is " + perimeter);



        }
    }
