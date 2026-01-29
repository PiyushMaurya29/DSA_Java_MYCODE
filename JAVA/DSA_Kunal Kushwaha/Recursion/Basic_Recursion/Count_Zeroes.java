package Recursion.Basic_Recursion;

import java.util.Scanner;
public class Count_Zeroes {
    static int countZero(int n , int count){
        if(n == 0) return count;
        int rem = n % 10;
//        if(rem == 0) count++;
        if(rem == 0){
            // Or write count+1 instead of ++count
            return countZero(n/10 , ++count);
        }
        else {
            return countZero(n/10 , count);
        }
    }

    // With the help of argument function
    static int count0(int n){
        return helper(n , 0);
    }
    // special pattern , how to pass a value to above calls
    static int helper(int n , int count){
        if(n == 0){
            return count;
        }
        int rem = n % 10;
        if(rem == 0){
            // count + 1
            return helper(n/10 , ++count);
        }
        return helper(n/10 , count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        // With the use of helper function
        System.out.println(count0(n));

        // Putting count in the argument
        int noOfZero = countZero(n , 0);
        System.out.println(noOfZero);

    }
}
