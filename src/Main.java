import java.util.Scanner;
import java.io.*;

class Area_Perimeter {
    public static void main(String[] args) {
        int side, l, b, perimeter, area;

        Scanner scanner = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        // Print the options
        System.out.println("Please select a shape:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");

        // Get the user's selection
        int shapeChoice = scanner.nextInt();

        // Prompt the user for another choice if they select Square
        if (shapeChoice == 1) {
            System.out.println("You selected Square");

            System.out.print("Enter the Side Length of Square: ");
            side = s.nextInt();
            area = side * side;
            System.out.println("\nArea = " + area);
            perimeter = 4 * side;
            System.out.println("\nPerimeter= " + perimeter);

        }

        // Print a message based on the selection
        else if (shapeChoice == 2) {
            System.out.println("You selected Rectangle.");

            System.out.print("Enter length of rectangle:");
            l = s.nextInt();
            System.out.print("Enter breadth of rectangle:");
            b = s.nextInt();
            perimeter = 2 * (l + b);
            System.out.println("Perimeter of rectangle:" + perimeter);
            area = l * b;
            System.out.println("Area of rectangle:" + area);

        } else if (shapeChoice == 3) {
            System.out.println("You selected Circle.");

            System.out.print("Enter length of rectangle:");
            l = s.nextInt();
            System.out.print("Enter breadth of rectangle:");
            b = s.nextInt();
            perimeter = 2 * (l + b);
            System.out.println("Perimeter of rectangle:" + perimeter);
            area = l * b;
            System.out.println("Area of rectangle:" + area);


        } else {
            System.out.println("Invalid selection. Please try again.");

        }


    }

}