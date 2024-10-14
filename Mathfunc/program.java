package Mathfunc;
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
                System.out.print("Enter first number: ");
                int a1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                int b1 = scanner.nextInt();
                System.out.println("Largest: " + Mathfunc.getLargest(a1, b1));
                break;

            case 2:
                System.out.print("Enter first number: ");
                int a2 = scanner.nextInt();
                System.out.print("Enter second number: ");
                int b2 = scanner.nextInt();
                System.out.println("Smallest: " + Mathfunc.getSmallest(a2, b2));
                break;

            case 3:
                System.out.print("Enter target number: ");
                int target = scanner.nextInt();
                System.out.print("Enter lower bound: ");
                int low = scanner.nextInt();
                System.out.print("Enter upper bound: ");
                int high = scanner.nextInt();
                System.out.println("IsBetween: " + Mathfunc.isBetween(target, low, high));
                break;

            case 4:
                System.out.print("Enter target number: ");
                int targetClamp = scanner.nextInt();
                System.out.print("Enter lower bound: ");
                int lowClamp = scanner.nextInt();
                System.out.print("Enter upper bound: ");
                int highClamp = scanner.nextInt();
                System.out.println("Clamped value: " + Mathfunc.clamp(targetClamp, lowClamp, highClamp));
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
