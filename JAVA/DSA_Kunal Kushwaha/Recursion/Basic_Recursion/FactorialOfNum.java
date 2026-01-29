package Recursion.Basic_Recursion;

import java.util.Scanner;

public class FactorialOfNum {
    static int facOfNum(int n){
        if(n==1) return 1;
        return n * facOfNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(facOfNum(n));
    }
}
