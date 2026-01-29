package Operators;
import java.util.Scanner;
public class Increment_Decrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 5 , q = 5;
        System.out.println(p++); // 5 Post increment => Use then Increase
        System.out.println(p); //6

        System.out.println(++q); // 6 Pre increment => Increase then Use
        System.out.println(q); //6

        int x = p++ , y = ++q;
        System.out.println(x); //6
        System.out.println(y); //7

        System.out.println(p); //7
        System.out.println(q); //7

    }
}
