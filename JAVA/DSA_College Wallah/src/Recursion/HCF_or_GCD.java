package Recursion;

import java.util.Scanner;

public class HCF_or_GCD {
    static int GCD_LongDivisionMethod(int x, int y){
        while (x%y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    static int gcd_Recursively(int x, int y){
        if(y == 0){
            return x;
        }
        return gcd_Recursively(y, x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int y = sc.nextInt();

        System.out.println(GCD_LongDivisionMethod(x,y));
        System.out.println(gcd_Recursively(x,y));

        System.out.println("LCM of x and y : "+(x*y)/gcd_Recursively(x,y));

        /*
            Euclid's Algorithm :
                GCD(x,y) = GCD(y,x%y)
                GCD(x,0) = x

                Example :
                gcd(24,15) = gcd(15,9) = gcd(9,6) = gcd(6,3) = gcd(3,0) = 3
         */

    }
}
