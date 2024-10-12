package Mathfunc;
import java.util.Scanner;


public class Mathfunc {
    public static int getLargest (int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static int getSmallest (int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }

    }
    public static boolean isBetween (int target, int low, int high) {
        if (target >= low && target <= high) {
            return true;
        } else {
            return false;
        }
    }
    public static int clamp (int target, int low, int high) {
        if (target < low) {
            return low;
        } else if (target > high) {
            return high;
        } else {
            return target;
        }
    }
    public static boolean isFactorOf (int factor, int multiple) {
        if (multiple % factor == 0) {
            return true;
        } else {
            return false;
        }
    }



    public static void main(String args []) {
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
                System.out.println("Largest: " + getLargest(a1, b1));
                break;

            case 2:
                System.out.print("Enter first number: ");
                int a2 = scanner.nextInt();
                System.out.print("Enter second number: ");
                int b2 = scanner.nextInt();
                System.out.println("Smallest: " + getSmallest(a2, b2));
                break;

            case 3:
                System.out.print("Enter target number: ");
                int target = scanner.nextInt();
                System.out.print("Enter lower bound: ");
                int low = scanner.nextInt();
                System.out.print("Enter upper bound: ");
                int high = scanner.nextInt();
                System.out.println("IsBetween: " + isBetween(target, low, high));
                break;

            case 4:
                System.out.print("Enter target number: ");
                int targetClamp = scanner.nextInt();
                System.out.print("Enter lower bound: ");
                int lowClamp = scanner.nextInt();
                System.out.print("Enter upper bound: ");
                int highClamp = scanner.nextInt();
                System.out.println("Clamped value: " + clamp(targetClamp, lowClamp, highClamp));
                break;

            case 5:
                System.out.print("Enter factor: ");
                int factor = scanner.nextInt();
                System.out.print("Enter multiple: ");
                int multiple = scanner.nextInt();
                System.out.println("Is factor: " + isFactorOf(factor, multiple));
                break;

            default:
                System.out.println("Invalid choice. Please select an option from 1-5.");
        }

             scanner.close();
        
    }

}


// Write these into the Math Class

// 1. An int Function getLargest 
//that takes two integer parameters and
// returns the larger of the two integers

// 2. An int Function getSmallest 
//that takes two integer parameters and 
//returns the smaller of the two integers

// 3. An boolean Function isBetween that
// takes three integer parameters (target, low, high)
// and returns true if target is between low and high

// 4. A clamp function
// that takes three integer parameters 
//(target, low, high) and returns target if 
//it is between low and high.  If it is too low 
//it will return low and if it is high return high.

// 5. isFactorOf Function that takes 
//two integers (factor, multiple) and
// return true if number factor is a factor of multiple