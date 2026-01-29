package Methods_OR_Functions;
import java.util.*;
public class CheckPrime_Method {
    public static boolean isPrime(int n){ // Only for n>=2
        //corner cases
        if(n==2){
            return true;
        }
        boolean isPrime = true;   // Assuming number is Prime
        for(int i=2 ; i<=n-1 ; i++){
            if(n%i==0){    // completely dividing
                isPrime = false;
                // return isPrime(false) instead of break
                break;
            }
        }
        return isPrime;
    }
    public static boolean isPrimeOptimized(int n){
        if(n==2){
            return true;
        }
        for(int i=2 ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Q. Check if a number is Prime or not.
           Prime_number(n) only divide by 1 and n.
         */

        System.out.print("Enter number want to check for prime : ");
        int n = sc.nextInt();

        System.out.println(isPrime(n));
        System.out.println(isPrimeOptimized(n));
    }
}
