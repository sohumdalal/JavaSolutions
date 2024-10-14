package Assignments.Mathfunc;

import Standard.Standard;
import java.util.Scanner;

public class program {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("What would you like to perform?");
        System.out.println("");
        System.out.println("1. Get Largest of 2 numbers");
        System.out.println("2. Get Smallest of 2 numbers");
        System.out.println("3. Check if a number is between a range");
        System.out.println("4. A clamp function");
        System.out.println("5. A factor function");
        System.out.println("");
        System.out.print("Enter your choice (1-5): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                int[] numbers = Standard.getTwoNumbers(); // Get the two numbers from input
                int largest = Mathfunc.getLargest(numbers[0], numbers[1]); // Call the method to get the largest number
                System.out.println("Largest: " + largest); // Print the result
                break;

            case 2:
                numbers = Standard.getTwoNumbers(); // Get the two numbers from input
                int smallest = Mathfunc.getLargest(numbers[0], numbers[1]); // Call the method to get the largest number
                System.out.println("smallest: " + smallest); // Print the result
                break;

            case 3:
                numbers = Standard.targetLowUpper();
                System.out.println("IsBetween: " + Mathfunc.isBetween(numbers[0], numbers[1], numbers[2]));
                break;

            case 4:
                numbers = Standard.targetLowUpper();
                System.out.println("Clamped value: " + Mathfunc.clamp(numbers[0], numbers[1], numbers[2]));
                break;

            case 5:
                System.out.print("Enter factor: ");
                int factor = scanner.nextInt();
                System.out.print("Enter multiple: ");
                int multiple = scanner.nextInt();
                System.out.println("Is factor: " + Mathfunc.isFactorOf(factor, multiple));
                break;

            default:
                System.out.println("Invalid choice. Please select an option from 1-5.");
        }

        scanner.close();

    }
}
