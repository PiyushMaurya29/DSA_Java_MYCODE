package Strings;
import java.util.*;
public class String_Builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String Builder is more efficient than the normal
        // method when we are talking about copying string
        StringBuilder sb = new StringBuilder("");
        for(char ch='a' ; ch<='z' ; ch++){
            sb.append(ch);
        }

        // T.C = O(n^2)
        System.out.println(sb);
    }
}
