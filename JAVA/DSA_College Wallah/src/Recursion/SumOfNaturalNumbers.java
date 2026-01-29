package Recursion;
import java.util.*;
public class SumOfNaturalNumbers {
    static int sumOfN(int n){
        if(n==1) return 1;
        int SumN = n + sumOfN(n-1);
        return SumN;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print sum of n natural numbers.
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        System.out.println("Sum of natural number till "+n+" : "+sumOfN(n));
    }
}
