package Conditional_and_Loops;

import java.util.Scanner;

public class countN_Times_Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q. Count number of times a digits appearing in a number

        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.print("Enter digit you want to count : ");
        int dig = sc.nextInt();

        int count = 0;
        while (num>0){
            int rem = num % 10 ;
            if(rem==dig) count++;
            num /= 10;
        }
        System.out.println("Number of occurrence of "+dig+" : "+count);
    }
}
