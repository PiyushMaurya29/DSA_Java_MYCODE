package Recursion;
import java.util.Scanner;
public class SumOfDigits_Recursion {
    static int sumOfDigit(int n){
        //base case
        if(n == 0) return 0;
        if(n>=0 && n<=9) return n;
        //recursive work -> small answer
//        int smallAns = sumOfDigit(n/10);
        //self work
//        int ans = smallAns + n%10;
        return sumOfDigit(n/10) + n%10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digit : ");
        int n = sc.nextInt();
        System.out.println("Sum of digit : "+sumOfDigit(n));

        // Time complexity = No. of Recursive calls * Time
        //                 = n * C => O(n) // n -> Number of digits
        // Space complexity = No. of stack calls => O(n)
    }
}
