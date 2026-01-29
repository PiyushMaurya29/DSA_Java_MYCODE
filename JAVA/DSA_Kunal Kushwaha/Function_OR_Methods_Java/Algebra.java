package Function_OR_Methods_Java;

import java.util.Scanner;

public class Algebra {
    static void addition(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
        int addition = num1 + num2;
        System.out.println("Addition of number : "+addition);
    }
    static void subtraction(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
        int subtraction = num1 - num2;
        System.out.println("Subtraction of number : "+subtraction);
    }
    static void multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
        int multiplication = num1 * num2;
        System.out.println("Multiplication of number : "+multiplication);
    }
    static void division(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
        int division = num1 / num2;
        System.out.println("Division of number : "+division);
    }
    static void modulo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
        int modulo = num1 % num2;
        System.out.println("Modulo of number : "+modulo);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q. WAP to do algebra like Addition,Subtraction,Multiplication,Division,Modulo

        addition();
        subtraction();
        multiplication();
        division();
        modulo();
    }
}
