package Basics;
import java.util.*;
public class findLargestAmong3 {
    static int findLargest(int a , int b , int c){
        if(a>b && a>c){
            return a;
        } else if (b>a && b>c) {
            return b;
        }
        else {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q. Find the largest of the 3 numbers.

        System.out.print("Enter 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        System.out.println("Largest : "+findLargest(a,b,c));

        int max1 = Math.max(a,Math.max(a,b));
        System.out.println("Maximum : "+max1);


        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println("Largest : "+max);
    }
}
