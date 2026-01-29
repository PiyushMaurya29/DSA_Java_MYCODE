package Basics;
import java.util.Scanner;
public class Sumof2Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x , y;
        System.out.print("Enter 1st number : ");
        x = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        y = sc.nextInt();

        int sum = x + y;
        System.out.println("The sum is : "+sum);


    }
}
