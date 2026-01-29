package Conditional_and_Loops;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Fibonacci Series : 0 , 1 , 1 , 2 , 3 , 5 , 8

        // Q. Find the Nth Fibonacci Number
        System.out.print("Enter Nth Number : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
//        for(int i=1 ; i<=n ; i++){
//            System.out.print(a+" ");
//            int c = a + b;
//            a = b;
//            b = c;
//        }
        // 2nd Method
        while (n>0){
            int temp = a + b;
            a = b;
            b = temp;
            n--;
        }
        System.out.println("Nth fibonacci number : "+a);
    }
}
