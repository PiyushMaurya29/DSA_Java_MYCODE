package Basics;

import java.util.Scanner;

public class Armstrong_Number {
    static boolean checkArmstrong(int num){
        int temp = num;
        int sumOfCubeOfDigits = 0;
        while (temp>0){
            int rem = temp % 10;
            sumOfCubeOfDigits += rem*rem*rem;
            temp /= 10;
        }
        return sumOfCubeOfDigits == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q. Check armstrong number for three digit.

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        if(checkArmstrong(num)){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }

        // Printing all 3 digit armstrong number
        for(int i=100 ; i<1000 ; i++){
            if(checkArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }
}
