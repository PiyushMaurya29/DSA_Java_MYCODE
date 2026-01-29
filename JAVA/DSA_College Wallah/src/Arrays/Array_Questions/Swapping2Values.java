package Arrays.Array_Questions;
import java.util.Scanner;
public class Swapping2Values {
    static void swap(int a , int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("First Swapped Integer : "+a);
        System.out.println("Second Swapped Integer : "+b);
    }
    static void swapWithoutTemp(int a , int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("First swapped integer : "+a);
        System.out.println("Second swapped integer : "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer : ");
        int a = sc.nextInt();
        System.out.print("Enter second integer : ");
        int b = sc.nextInt();

        swap(a,b);

        swapWithoutTemp(a,b);



    }
}
