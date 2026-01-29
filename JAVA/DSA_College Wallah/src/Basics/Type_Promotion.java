package Basics;
import java.util.*;
public class Type_Promotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 1. Java automatically promotes each byte,short,or char operand to int
              when evaluating an expression.
           2. If one operand is long,float or double the whole expression is promoted
              to long,float,or double respectively.
         */
//        char a = 'a'; // 97
//        char b = 'b'; // 98
//        System.out.println(b-a);

        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;
        System.out.println(ans);

//        byte z = 5;
//        z = z * 2; // Not possible because it converted into integer type

        byte z = 5;
        z = (byte)(z*2);
        System.out.println(z);


    }
}
