package Recursion.Basic_Recursion;

import java.util.Scanner;

public class Fibonacci_Number {
    static int fibonacciNum(int n){
        // base condition
        if(n < 2){
            return n;
        }
//        if(n==0 || n==1){
//            if(n==0) return 0;
//            if(n==1) return 1;
//        }
        return fibonacciNum(n-1) + fibonacciNum(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q. Find the Nth Fibonacci Number
        // Fibonacci series : 0 , 1 , 1 , 2 , 3 , 5 , 8 ....

        // Formula we can derive :  F(N) = F(N-1) + F(N-2)
        // This is known as recurrence relation
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.println(fibonacciNum(n));

    }
}
