package Recursion;
import java.util.Scanner;
public class Fibonacci_Recursion {
    static int fib(int n){
        if(n==0 || n==1) return n;
//        int previousNum = fib(n-1);
//        int second_previousNum = fib(n-2);
//        int ans = previousNum + second_previousNum;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // f(n) = f(n-1) + f(n-2)

        System.out.print("Enter the Nth fibonacci term : ");
        int n = sc.nextInt();

        // Time Complexity = No. of recursive calls * Time taken in 1 call
        //                 = 2^n * C => O(2^n)


        for(int i=0 ; i<=n ; i++){
            System.out.println(i+"th Fibonacci number : "+fib(i));
        }

    }
}
