package Methods_OR_Functions;
import java.util.*;
public class SumOfDigits_Method {
    static int sumOfDigit(int n){
        int sumOfDigit = 0;
        while (n!=0){
            int lastDigit = n % 10;
            sumOfDigit += lastDigit;
            n = n / 10;
        }
        return sumOfDigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q. Write a Java method to compute the sum of the digits in an integer.

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println("Sum of digit of "+num+" : "+sumOfDigit(num));
    }
}
