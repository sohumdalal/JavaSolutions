package Standard;
import java.util.Scanner;

public class Standard {

    public static int[] getTwoNumbers() {
        
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter first number: ");
        int a1 = scanner.nextInt();  
        System.out.print("Enter second number: ");
        int b1 = scanner.nextInt();  


        scanner.close(); 

        return new int[] {a1, b1};
    }

    public static int[] targetLowUpper () {
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter target number: ");
        int target = scanner.nextInt();
        System.out.print("Enter lower bound: ");
        int low = scanner.nextInt();
        System.out.print("Enter upper bound: ");
        int high = scanner.nextInt();
        scanner.close(); 

        return new int[] {target, low, high};
    }

}
