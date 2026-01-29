package Loops;
import java.util.Scanner;
public class a_to_power_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Question : Given two num a and b . Find a raise to power b.
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        int power = 1;

        for(int i=1 ; i<=b ; i++){
            power *= a; // power = power * a;
        }
        System.out.println("The value of a raise to b is : "+power);

    }
}
