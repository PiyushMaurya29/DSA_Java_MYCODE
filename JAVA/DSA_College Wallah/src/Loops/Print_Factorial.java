package Loops;
import java.util.Scanner;
public class Print_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number till you want your factorial value : ");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i=0 ; i<=num ; i++){
            if(i==0) {
                factorial = 1;
                System.out.println("The factorial of 0 is " + factorial);
            }
            else{
                factorial = factorial * i;
                System.out.println("The factorial of " + i + " is " + factorial);
            }
            }
    }
}
