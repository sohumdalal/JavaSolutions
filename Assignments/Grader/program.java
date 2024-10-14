package Assignments.Grader;
import java.util.Scanner;

public class program {
    public static void main(String args []) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a grade number: ");
        int num1 = scanner.nextInt();

        String letterGrade = grader.gradeCalc(num1);
        System.out.println("The letter grade is: " + letterGrade);

        scanner.close();
    }

}
