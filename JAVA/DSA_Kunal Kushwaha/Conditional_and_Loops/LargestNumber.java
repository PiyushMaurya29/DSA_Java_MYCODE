package Conditional_and_Loops;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Find the largest number out of three numbers
        System.out.print("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 1st Method
        // We are assuming one number as maximum number
//        int max = a;
//        if(b>max){
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }

        // 2nd Method
//        int max = Integer.MIN_VALUE;
//        if(a>max){
//            max = a;
//        }
//        if(b>max){
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }

        // 3rd Method
//        int max = 0;
//        if(a>b && a>c){
//            max = a;
//        }
//        else if(b>a && b>c){
//            max = b;
//        }
//        else{
//            max = c;
//        }
        // 4th Method
        int max = Math.max(a,Math.max(b,c));
        System.out.println("Maximum number : "+max);
    }
}
