package Strings;
import java.util.*;
public class ImmutabilityOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Why Immutability
           If immutability will not exist then things like interning is present the it
           is threatening for security purposes and not good for security purpose
         */
        String str = "Hello";
        // Immutable example
        // str.charAt(4) = '3'; This is not allowed . If you want to change then change string directly

        char ch = str.charAt(2);  //stores element of given index

        // If you want to change l of Hello to Heylo then change string directly or use this
        // str = "Heylo";
        str = str.substring(0,2) + "y" + str.substring(3,5);
        System.out.println(str);


        // Performance of Strings in java has very poor performance because of immutability

    }
}
