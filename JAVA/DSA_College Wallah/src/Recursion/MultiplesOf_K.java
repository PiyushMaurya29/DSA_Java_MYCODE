package Recursion;
import java.util.Scanner;
public class MultiplesOf_K {
    static void printMultiples(int n , int k){
        //base case
        if(k==0) return;
        //recursive work
        printMultiples(n,k-1);
        //self work
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q. Given a number and a value k . Print k multiples of num.
        /* Constraints : k>0
           Input 1 : num = 12 , k=5
           Output 1 : 12 , 24 , 36 , 48 , 60

           Input 2 : num = 3 , k=8
           Output 2 : 3,6,9,12,15,18,21,24
         */

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Enter value of k : ");
        int k = sc.nextInt();

        printMultiples(num,k);
    }
}
