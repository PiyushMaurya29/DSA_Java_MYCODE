package Recursion.Basic_Recursion;

import java.util.Scanner;

public class Sum_and_Prod_Of_Digit {
    static int sumOfDigits(int n){
        if(n == 0) return 0;
        return sumOfDigits(n / 10) + (n % 10);
    }
    static int productOfDigits(int n){
//        if(n % 10 == n) return n;
        if(n==0) return 1;
        return productOfDigits(n / 10) * (n % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Sum of digits : "+sumOfDigits(n));
        System.out.println("Product of digits : "+productOfDigits(n));

    }
}
