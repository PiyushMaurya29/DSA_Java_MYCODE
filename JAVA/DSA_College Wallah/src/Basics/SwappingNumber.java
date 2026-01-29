package Basics;
import java.util.Scanner;
public class SwappingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("The 1st number is "+num1);
        System.out.println("The 2nd number is "+num2);

    }
}
