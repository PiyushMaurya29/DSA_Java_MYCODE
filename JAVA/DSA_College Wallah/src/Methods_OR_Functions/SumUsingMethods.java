package Methods_OR_Functions;
import java.util.*;
public class SumUsingMethods {
    static int sum(int a , int b){ // a , b are parameters or formal parameters
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum : "+sum(a,b)); // a , b are arguments or actual parameters
    }
}
