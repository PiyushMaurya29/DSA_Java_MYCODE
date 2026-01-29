package Recursion.Basic_Recursion;

import java.util.Scanner;

public class NumbersPrinting {
    static void printNumAscOrder(int n){
        if(n==0) return;
        printNumAscOrder(--n); // n = n - 1
        System.out.print(n+" ");
    }
    static void printNumDecOrder(int n){
        if(n==0) return;
        System.out.print(n+" ");
        printNumDecOrder(--n); // n = n - 1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        printNumAscOrder(n);
        System.out.println();
        printNumDecOrder(n);

    }
}
