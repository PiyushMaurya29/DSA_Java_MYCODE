package Number_Binary_System;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary number : ");
        int binary_num = sc.nextInt();
        int ans = 0;
        int powOf2 = 1; //2^0=1

        while (binary_num>0){
            int unit_digit = binary_num % 10;
            ans += (unit_digit*powOf2);
            binary_num /= 10;
            powOf2 *= 2;
        }
        System.out.println("The decimal number is "+ans);
    }
}
