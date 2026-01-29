package Conditional_and_Loops;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int revAns = 0;
        while (num>0){
            int rem = num % 10;
            num /= 10;
            revAns = revAns*10 + rem;
        }
        System.out.println("Reverse of number : "+revAns);
    }
}
