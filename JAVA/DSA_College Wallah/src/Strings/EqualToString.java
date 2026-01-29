package Strings;
import java.util.*;
public class EqualToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        // s1 and s2 points same string in heap memory
        // s3 is on completely new string other than s1 and s2 with pointing a new address

        System.out.println(s1==s2);  //Gives true value
        System.out.println(s1==s3);  //Gives false value because of new addresses

        // If you want to check actual string completely then use equals()
        System.out.println(s1.equals(s2)); // return true
        System.out.println(s1.equals(s3)); // return true
    }
}
