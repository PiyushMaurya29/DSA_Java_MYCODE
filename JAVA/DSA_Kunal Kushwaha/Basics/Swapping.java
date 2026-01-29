package Basics;

import java.util.Scanner;

public class Swapping {
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        // Swapping two numbers
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("First number : "+num1);
        System.out.println("Second number : "+num2);

        // If we try to swap numbers using a function it will not swap
        // Because numbers is passed by value not reference

        int a = 10;
        int b = 20;
        swap(a,b);
        // Swapping didn't took placed
        System.out.println(a+","+b);

    }
}
