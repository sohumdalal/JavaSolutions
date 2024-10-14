package Assignments.Mathfunc;


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