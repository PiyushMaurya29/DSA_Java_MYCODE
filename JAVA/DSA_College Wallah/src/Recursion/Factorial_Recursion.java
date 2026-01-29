package Recursion;
import java.util.Scanner;
public class Factorial_Recursion {
    static int factorial(int n){
        // base case
        if(n == 0) return 1;

        // smaller problem - recursive work
        // big problem - self work
        int factAns = n * factorial(n-1);
        return factAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // f(n) = n*f(n-1)  Recurrence Relation

        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        System.out.println("Value of "+n+"! is : "+factorial(n));

        // Time and Space Complexity = O(n)
    }
}
