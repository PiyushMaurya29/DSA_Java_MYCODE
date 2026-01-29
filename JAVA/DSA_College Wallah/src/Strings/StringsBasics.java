package Strings;
import java.util.Scanner;
import java.util.*;   // It imports everything required
public class StringsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Strings is collection of character arrays.
        // Strings are IMMUTABLE
        char arr[] = new char[10];

        char brr[] = {'a','b','c'};

        //Declaration or initialization of strings
        String ztr = new String("xxx");
        String str = "Piyush Maurya";
        System.out.println(str);

        //Taking string as input
//        String str1 = sc.next();   // It takes input til we enter space
        String str1 = sc.nextLine();  // It takes whole sentence input
        System.out.println(str1);
    }
}
