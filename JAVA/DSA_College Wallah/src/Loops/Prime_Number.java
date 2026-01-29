package Loops;
import java.util.Scanner;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int a = 0;
        for(int i=2 ; i<n ; i++){
            if(n%i==0){
                a = 1;
                break;
            }
        }
        if(n==0) System.out.println("0 is neither prime nor composite");
        if(n==1) System.out.println("1 is neither prime nor composite");
        else if(a==0) System.out.println("The given number is prime");
        else System.out.println("The given number is composite");

    }
}
