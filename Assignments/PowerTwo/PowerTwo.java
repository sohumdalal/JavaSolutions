package Assignments.PowerTwo;

public class PowerTwo {

    public static String powerCalc (int power) {
        String powerString = "";
        int currentCalc = 1;
        powerString += currentCalc;

        for (int i = 1; i < power; i++) {
            currentCalc = currentCalc * 2;
            powerString += currentCalc;
        }
        return powerString;
    }

    public static void powerCalcLong (int power) {
        int currentCalc = 1;
        System.out.println("Here are the first " + power + " powers of 2: ");
        System.out.println("2^0 = 1");
        for (int i = 1; i < power; i++) {
            currentCalc = currentCalc * 2;
            System.out.println("2^" + i + " = " + currentCalc);
        }
    }
    

}


// Powers of 2 Assignment:
// Powers of 2

// File PowersOf2.java contains a skeleton of a program to read in an integer from the user and print out that many powers of 2, starting with 20.

// 1. Using the comments as a guide, complete the program so that it prints out the number of powers of 2 that the user requests. Do not use Math.pow to compute the powers of 2! Instead, compute each power from the previous one (how do you get 2n from 2n–1?). For example, if the user enters 4, your program should print this:

// Here are the first 4 powers of 2:

// 1248

// 2. Modify the program so that instead of just printing the powers, you print which power each is, e.g.:

// Here are the first 4 powers of 2:

// 2^0 = 1

// 2^1 = 2

// 2^2 = 4

// 2^3 = 8


