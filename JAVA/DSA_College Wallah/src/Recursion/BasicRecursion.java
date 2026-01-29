package Recursion;
import java.util.Scanner;
public class BasicRecursion {
    static void printNumIncreasing(int n){  // 1 , 2 , 3 , 4 , 5....n-1
        //base case
        if(n==1){
            System.out.println(n);
            return;
        }
        //recursive work
        printNumIncreasing(n-1);
        //self work
        System.out.println(n);
    }
    static void printNumDecOrder(int n){
        System.out.println(n);
        if(n==1) return;
        printNumDecOrder(n-1);
    }
    static void printNumDecreasing(int n){
        if(n==1){                            //Base Case
            System.out.println(n);
            return;
        }
        System.out.println(n);               //Self Work
        printNumDecreasing(n-1);          //recursive work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Recursion -> A function calling itself with different parameters
         * Base Case OR Halting Condition is must in recursion to terminate condition
         * In recursion , we solve bigger problems by solving smaller problems
         */

        /* Steps for solving recursion problems
        1. Identify the smaller problem and Let recursion solve problem and trust on method
        2. Self work -> Do your work
        3. Identify the base Case -> Smallest problem for which answer is obvious
        *** NOTE -> Identify which work to do first recursive or self work
         */

        /* Syntax of Recursive Function
             methodName(N parameters){
             if(half Condition){        //This is base case
             return result
             }
             return methodName(N parameters)  //Recursive work
             }
         */

        //Q. Write a program to print all natural numbers from 1 to n using recursion

        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

//        printNumIncreasing(n);

        //Q. Write a program to print all natural numbers from n to 1 using recursion
        printNumDecreasing(n);

    }
}
