package Grader;
import java.util.Scanner;


public class grader {
    
    public static String gradeCalc (int input) {
        if(input >= 90 && input < 100) {
            return "A";
        }
        else if(input >= 80 && input <= 89) {
            return "B";
        }
        else if(input >= 70 && input <= 79) {
            return "C";
        }
        else if(input >= 60 && input <= 69) {
            return "D";
        }
        else {
            return "F";
        }
    }

    public static void main(String args []) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a grade number: ");
        int num1 = scanner.nextInt();

        String letterGrade = gradeCalc(num1);
        System.out.println("The letter grade is: " + letterGrade);

        scanner.close();
    }


}