package Basics;
import java.util.Scanner;
public class FindRemainderModulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dividend : ");
        int Dividend = sc.nextInt();
        System.out.print("Enter Divisor : ");
        int Divisor = sc.nextInt();

        int Remainder = Dividend % Divisor;
        System.out.println("The Remainder is : "+Remainder);

    }
}
