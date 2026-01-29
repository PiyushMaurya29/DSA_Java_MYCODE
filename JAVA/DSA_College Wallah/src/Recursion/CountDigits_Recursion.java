package Recursion;
import java.util.Scanner;
public class CountDigits_Recursion {
    static int countDigits(int n){
        // base case
        if(n>=0 && n<=9){
            return 1;
        }
        //recursive work
        int smallAns = countDigits(n/10);
        //self work
        return smallAns + 1;
    }
    static int countDigits2(int n, int count){
        if(n == 0) return count;
        return countDigits2(n/10 , ++count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digit : ");
        int n = sc.nextInt();

        System.out.println("Number of digits in  "+n+" :  "+countDigits(n));
    }
}
