package Sting_and_StringBuilder;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        /*
           ASCII values
           * a = 97
           * A = 65
           * 0 = 48
         */
        System.out.println('a'%'b');
        System.out.println("a"+"b");  // Concatenate strings
        System.out.println('a'+10);
        System.out.println((char)('a'+10));
        System.out.println("f"+9);
        // this is same as after a few steps : "f" + "9"
        // integer will be converted to Integer that will call .toString()

        System.out.println("Shaurya" + new ArrayList<>());
//        System.out.println("Piyush" + new Integer(100));
//        System.out.println(new Integer(90) + new ArrayList<>());  // It will give error
    }
}
