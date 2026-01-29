package Loops;
import java.util.Scanner;
public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Question : Print => 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 ....
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        int a = 1 , b =1 , sum = 1;
        for(int i=1 ; i<=n-2 ; i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println("The "+n+" fibonacci term is "+sum);
    }
}
