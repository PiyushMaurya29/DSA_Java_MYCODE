package Switch_Case;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an operator : ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        switch (operator){
            case '+' : int sum = a + b;
                System.out.print(sum);
                break;

            case '-' : int subtract = a - b;
                System.out.print(subtract);
                break;

            case '*' : int multiply = a * b;
                System.out.print(multiply);
                break;

            case '/' : int divide = a / b;
                System.out.print(divide);
                break;
        }
    }
}
