package Basics;
import java.util.Scanner;
public class Finding_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a > b
        System.out.print("Enter Dividend : ");
        int Dividend = sc.nextInt();
        System.out.print("Enter b : ");
        int Divisor = sc.nextInt();
        int Quotient = Dividend / Divisor;
        int Remainder = Dividend - Divisor * Quotient;
        System.out.println("The remainder when "+Dividend+" is divided by "+Divisor+" is "+Remainder);

    }
}
