package IF_ELSE;
import java.util.Scanner;
public class _3Digit_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if(num>99 && num<1000)
            System.out.println("Number "+num+" is 3 digit number.");
        else
            System.out.println("Number "+num+" is not 3 digit number.");
    }
}
