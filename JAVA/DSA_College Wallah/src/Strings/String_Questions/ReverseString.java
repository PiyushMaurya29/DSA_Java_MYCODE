package Strings.String_Questions;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String input = sc.nextLine();

        // Reverse the input string using StringBuilder
        String output = new StringBuilder(input).reverse().toString();

        System.out.println("Input String : "+input);
        System.out.println("Output String : "+output);
    }
}
