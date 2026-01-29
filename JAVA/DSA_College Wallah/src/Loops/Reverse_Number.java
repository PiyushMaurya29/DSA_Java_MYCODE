package Loops;
import java.util.Scanner;
public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Question : Reverse the digit of a number;

        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int reverse = 0;

        //Using for loop;
//        for(int i=1 ; num>0 ; i++){
//            reverse = (reverse * 10) + num%10;
//            num = num / 10;
//        }
//        System.out.println("The reverse of number is "+reverse);

        //Using while loop
        while (num>0){
            reverse = (reverse*10) + num%10;
            num /= 10;
        }
        System.out.println("The reverse of number is "+reverse);
    }
}
