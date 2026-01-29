package Methods_OR_Functions;
import java.util.*;
public class PrintAllPrimeInARange {
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
    static void printPrimeInRange(int n){
        for(int i=2 ; i<=n ; i++){
            if(isPrimeOptimized(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print all Prime numbers in a Range
        System.out.print("Enter the range : ");
        int n = sc.nextInt();

        printPrimeInRange(n); // Print in range of 2 to n
    }
}
