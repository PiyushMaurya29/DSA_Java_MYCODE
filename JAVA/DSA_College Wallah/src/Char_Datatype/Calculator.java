package Char_Datatype;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user till does not press X or x

        int ans = 0;

        while (true){
            // take the operator as input
            System.out.print("Enter the operator : ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' || op=='x' || op=='X'){
                // input two numbers
                System.out.print("ENTER 2 numbers : ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }
                else if(op == '-'){
                    ans = num1 - num2;
                }
                else if(op == '*'){
                    ans = num1 * num2;
                }
                else if(op == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }
                else if(op == '%'){
                    ans = num1 % num2;
                }
                else if(op == 'x' || op == 'X'){
                    break;
                }
                else {
                    System.out.println("Invalid Operation");
                }
                System.out.println(ans);
            }

        }
    }
}
