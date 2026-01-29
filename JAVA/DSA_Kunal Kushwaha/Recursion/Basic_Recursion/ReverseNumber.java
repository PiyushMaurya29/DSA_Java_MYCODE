package Recursion.Basic_Recursion;

import java.util.Scanner;

import static java.lang.Math.pow;

public class ReverseNumber {
    static int sum = 0;
    static void reverseNum1(int n){
        if(n == 0) return;
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseNum1(n / 10);
    }
    static int reverseNumRec(int n){
        int digits = (int)(Math.log10(n) + 1);
        return helper(n , digits);
    }
    static int helper(int n , int digits){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
//        If you don't want to do type conversion then make the return type to double
        return (int)(rem * Math.pow(10 , digits - 1) + helper(n / 10 , digits - 1));
    }
    public static boolean isPalindrome(int n){
        return n == reverseNumRec(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        reverseNum1(n);
        System.out.println(sum);
        System.out.println(reverseNumRec(n));

        System.out.println(isPalindrome(12321));

    }
}
