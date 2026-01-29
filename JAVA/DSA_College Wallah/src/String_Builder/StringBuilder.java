package String_Builder;
import java.util.*;
public class StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaration of stringBuilder
        java.lang.StringBuilder str = new java.lang.StringBuilder("hello");
        // We can also give capacity here

        str.append("world");
        System.out.println(str);
    }
}
