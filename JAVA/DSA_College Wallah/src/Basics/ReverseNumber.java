package Basics;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int reverseNumber = 0 , remainder;

        while (number != 0){
            remainder = number % 10;
            reverseNumber = (reverseNumber * 10) +remainder;
            number = number / 10;
        }
        System.out.println("The reversed number is "+reverseNumber);
    }
}
