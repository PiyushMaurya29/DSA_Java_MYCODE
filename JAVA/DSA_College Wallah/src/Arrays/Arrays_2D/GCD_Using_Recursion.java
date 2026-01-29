package Arrays.Arrays_2D;
import java.util.Scanner;
public class GCD_Using_Recursion {
    static int gcd_1stMethod(int x , int y){
        //1st Method : Using long division method
        //This is using long division method
        while(x%y!=0){
            int remainder = x % y;
            x = y;
            y = remainder;
        }
        return y;
    }

    static int gcd_Recursion(int x , int y){
        if(y==0) return x;
        return gcd_Recursion(y , x % y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Q. Given two numbers x and y. Find the greatest common divisor or HCF
        of x and y using recursion.

          Constraints : 0<=x , y<=10^6
          Input : x=4 , y=9  : Output : 1
         */

        System.out.print("Enter x and y : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        //1st Method
        System.out.println("HCF or GCD of x and y : "+gcd_1stMethod(x,y));

        /*2nd Method
          gcd(x,y) = gcd(y , x%y)
          gcd(x,0) = x
          Example : gcd(24,15) = gcd(15,9) = gcd(9,6) = gcd(6,3) = gcd(3,0) = 3

          Relation b/w LCM and HCF =>   LCM * HCF = x * y
         */
        System.out.println("HCF or GCD of x and y using recursion : "+gcd_Recursion(x,y));

        //Relation b/w LCM and HCF =>   LCM * HCF = x * y
        System.out.println("LCM of x and y : "+(x*y)/gcd_Recursion(x,y));

    }
}
