package Methods_OR_Functions;
import java.util.*;
public class FunctionOverloading {
    static int multiply(int a , int b){
        return a * b;
    }
    static float multiply(float a , float b){
        return a * b;
    }
    static double multiply(double a , double b){
        return a * b;
    }
    static int multiply(int a , int b , int c){
        return a * b * c;
    }
    static float sum(float a , float b){
        return a + b;
    }
    static int sum(int a , int b , int c){
        int sum = a + b + c;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Multiple functions with the same name but different parameters.
           Example : Calculators
                   * multiply(int a , int b).
                   * multiply(float a , float b).
                   * multiply(double a , double b).

           *As all multiply function has same name but the parameters they
            are receiving are of different data types that makes them different
            Function Overloading allows us to make same name of method with having similar working

            * In function overloading the difference of parameters takes place. Difference in return type will not impact
         */

        int a = 5;
        int b = 10;
        int c = 100;

        System.out.println(multiply(a,b));  // Multiply two numbers with same function name
        System.out.println(multiply(a,b,c)); // Multiply three numbers with same function name

        int x = 5;
        int y = 10;
        int z = 100;
        System.out.println(sum(x,y,z));
        System.out.println(sum(45.5f,2));
    }
}
