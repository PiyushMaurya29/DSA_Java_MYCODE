package Loops;
import java.util.Scanner;
public class Sum_of_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number till you want sum : ");
        int num = sc.nextInt();

        //Using for loop
        int sum1 = 0;
        for (int i=1 ; i<=num ; i++){
            sum1 = sum1 + i ;
        }
        System.out.println("The sum of number is "+sum1);

        //Using while loop
        int sum2 = 0;
        int n = 1;
        while(n<=num){
            sum2 = sum2 + n;
            n++;
        }
        System.out.println("The sum of number is "+sum2);
    }
}
