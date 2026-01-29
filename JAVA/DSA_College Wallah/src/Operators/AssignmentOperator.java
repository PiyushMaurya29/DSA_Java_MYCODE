package Operators;
import java.util.Scanner;
public class AssignmentOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = 10 , q;

        q = p;
        System.out.println(q); //10

        p+=q; // p = p + q
        System.out.println(p); //20

        p-=q; // p = p - q
        System.out.println(p); //10

        p*=q; // p = p * q
        System.out.println(p); //100

        p/=q; // p = p / q
        System.out.println(p); //10




    }
}
