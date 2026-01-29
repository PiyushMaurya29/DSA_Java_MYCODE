package Recursion;
import java.util.Scanner;
public class SumAlternateSign_Recursion {
    static int sumAlternate(int n){
        //f(n) = f(n-1) + n -> For sum of n natural numbers
        // 1-2+3-4+5-6+7-8+9-10   //Add odds and subtract evens
        if(n==1) return 1;
        if(n%2==0) return sumAlternate(n-1) - n;  //For even numbers
        return sumAlternate(n-1) + n;             //For odd numbers
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q. Given a number n . Find the sum of natural numbers till n but with alternate sign

        /*
           That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
           Constraints : 0<=n<=10^6
         */

        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        System.out.println("Alternate Sum of Series : "+sumAlternate(n));

    }
}
