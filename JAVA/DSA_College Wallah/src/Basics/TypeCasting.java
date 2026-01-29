package Basics;
import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
           * type conversion(widening)(implicit conversion) in java can be converted automatically in java
           * type casting is done by programmer
           a.type compatible
           b.destination type > source type
         */

//        int num = (int)(78.399);  //typecasting
//        System.out.println(num);
//
//        int a = 258;
//        byte b = (byte)a;
//        // byte stores upto value 256 the b stores 258 % 256 in b
//        System.out.println(b);
//
//        int number = 'A';
//        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.678f;
        double d = 0.4455;
        double result = (f*b) + (i/c) - (d*s);
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);

    }
}
