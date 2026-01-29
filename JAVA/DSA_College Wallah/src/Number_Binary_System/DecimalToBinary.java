package Number_Binary_System;
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number : ");
        int decimal_num = sc.nextInt();
        int ans = 0; //binary number
        int powOf10 = 1;

        while(decimal_num>0){
            int parity = decimal_num % 2;
            ans += (parity * powOf10);
            powOf10 *= 10;
            decimal_num /= 2;
        }
        System.out.println("The binary number is "+ans);

    }
}
