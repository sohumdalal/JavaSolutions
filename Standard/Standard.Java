package Standard;

import java.util.Scanner;
import java.io.File;
import java.util.HashMap;


public class Standard {

    //used in Mathfunc
    public static int[] getTwoNumbers() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b1 = scanner.nextInt();

        scanner.close();

        return new int[] { a1, b1 };
    }

    //used in Mathfunc
    public static int[] targetLowUpper() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter target number: ");
        int target = scanner.nextInt();
        System.out.print("Enter lower bound: ");
        int low = scanner.nextInt();
        System.out.print("Enter upper bound: ");
        int high = scanner.nextInt();
        scanner.close();

        return new int[] { target, low, high };
    }

    //from teacher video
    public static String AskQuestion(String Question) {
        String output = " ";
        Scanner UserInput = new Scanner(System.in);
        System.out.println(Question);
        output = UserInput.nextLine();
        return output;
    }

    //from teacher video
    public static int AskIntQuestion(String Question) {
        int output = 0;
        String UserAnswer = AskQuestion(Question);
        try {
            output = Integer.parseInt(UserAnswer);
        } catch (Exception e) {
            System.out.println("Please give a numeric answer!");
            output = AskIntQuestion(Question);
        }
        return output;
    }

    //from teacher video
    public static String ReadAllText(String Path) {
        // declare and intialize all necessary variables
        String output = "";
        File myFile = new File(Path);
        try {
            Scanner FileInput = new Scanner(myFile);
            while(FileInput.hasNextLine()) {
                output += FileInput.nextLine() +  "\n";
            }
            FileInput.close();
        } 
        catch (Exception e) {
            System.out.println("File not found");
        }
        
        return output;

    }

     //from teacher video
    public static String [][] ReadCSVText(String Path) {
     String RawData = ReadAllText(Path);
     String [] lines = RawData.split("\n");
     String[][] output = new String[lines.length][];
     for(int i = 0; i < lines.length; i++) {
        output[i] = lines[i].split(",");
     }
     return output;
    }

    public static boolean isFactorOf (int num, int test) {
        if(num % test == 0) return true;
        return false;
    }

    public static int getGreatestCommonFactor(int a, int b) {
        int output = 0;  
        int test = 1;   

        while (test <= a && test <= b) {  
            if (isFactorOf(a, test) && isFactorOf(b, test)) {
                output = test;  
            }
            test++; 
        }

        return output;
    }

    public static String isPrime (int num) {
        
        if (num < 2) {
            return "Not a prime";
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) return "Not a prime";
        }


        return "is a Prime";
    }

    public static int factorial (int num) {
        int finalProduct = 1;

        while (num > 0) {
            finalProduct = finalProduct * num;
            num--;
        }

        return finalProduct;
    }

    public static boolean isPalindrome (String string) {
        
        
        int left = 0;
        int right = string.length() - 1;
        
        while (left < right) {
            if(string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;

    }

    public static int fibonacci(int number) {
        if (number <= 1) return number;
        int a = 0, b = 1;
        for (int i = 2; i < number; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static int countCharacter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
    
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }



    public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}

}

