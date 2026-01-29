package Methods_OR_Functions;
import java.util.*;
public class FactorialOfN {
    static int factorial(int n){
        if(n<0){
            System.out.println("Factorial Not Possible");
            return -1;
        }
        if(n==0) return 1;
        int fact = 1;
        for(int i=2 ; i<=n ; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Find factorial of a number using Methods
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        // This will print factorial of number n
        System.out.println("Factorial of "+n+"! : "+factorial(n));

        // This for loop will print factorial of number n from 0 to n
        for(int i=0 ; i<=n ; i++){
            System.out.println("Factorial of "+i+"! : "+factorial(i));
        }
    }
}
