package Assignments.PowerTwo;
import java.util.Scanner;

public class program {
    public static void main (String args []) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer, and I will give you your powers: ");
        int power = scanner.nextInt();

        // String finalString = powerCalc(power);
        // System.out.println("Here are the first " + power + " powers of 2: " + finalString);

        PowerTwo.powerCalcLong(power);
        PowerTwo.powerCalc(power);

        scanner.close();
    }
}
