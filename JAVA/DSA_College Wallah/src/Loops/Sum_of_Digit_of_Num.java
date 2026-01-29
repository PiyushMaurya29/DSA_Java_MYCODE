package Loops;
import java.util.Scanner;
public class Sum_of_Digit_of_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Question : Find the sum of digit in a given number n;

        System.out.print("Enter the Digit : ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i=0 ; num>0 ; i++){
            sum = sum + num%10; //sum += num%10;
            num = num / 10;
        }
        System.out.println("The sum of digit is "+sum);
    }
}
