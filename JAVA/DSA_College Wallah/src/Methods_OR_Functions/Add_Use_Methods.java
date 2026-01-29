package Methods_OR_Functions;
import java.util.Scanner;
class Algebra{
    int add(int a , int b){
        int ans = a + b;
        return ans;
    }
    int subtract(int a , int b){
        int ans = a - b;
        return ans;
    }
    int multiply(int a , int b){
        int ans = a * b;
        return ans;
    }
    int divide(int a , int b){
        int ans = a/b;
        return ans;
    }
}
public class Add_Use_Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Algebra obj = new Algebra();

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.print("Sum of input number is : ");
        int add = obj.add(a,b);
        System.out.println(add);

        System.out.print("Subtraction of input number is : ");
        int subtract = obj.subtract(a,b);
        System.out.println(subtract);

        System.out.print("Multiplication of input is : ");
        int multiply = obj.multiply(a,b);
        System.out.println(multiply);

        System.out.print("Division of input is : ");
        int divide = obj.divide(a,b);
        System.out.println(divide);
    }
}
