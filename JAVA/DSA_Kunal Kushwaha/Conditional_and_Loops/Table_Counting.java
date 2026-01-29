package Conditional_and_Loops;

import java.util.Scanner;

public class Table_Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for a table : ");
        int num = sc.nextInt();

        for(int i=1 ; i<=10 ; i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
