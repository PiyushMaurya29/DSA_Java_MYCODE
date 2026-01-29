package Operators;
import java.util.Scanner;
public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        String result;
        result =  (num%2==0) ? "Even" : "Odd";

        System.out.println(result);
    }
}
