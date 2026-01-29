package Basics;
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();

        int num1 = 0 , num2 = 1 , sum = 0;
        System.out.print("Fibonacci Series : ");
        for(int i=1 ; i<=n ; i++){
            System.out.print(num1+" ");
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        System.out.println();

        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= num){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("Fib : "+b);
    }
}
