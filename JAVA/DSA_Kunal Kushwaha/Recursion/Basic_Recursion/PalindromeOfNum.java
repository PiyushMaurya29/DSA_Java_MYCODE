package Recursion.Basic_Recursion;

import java.util.Scanner;

public class PalindromeOfNum {
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
    static boolean palindromeOfNum(int n){
        return n == reverseNumRec(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(palindromeOfNum(10101));
    }
}
