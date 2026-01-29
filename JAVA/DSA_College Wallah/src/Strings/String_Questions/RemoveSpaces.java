package Strings.String_Questions;
import java.util.*;
public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Remove all the white spaces using regex
        String output = input.replaceAll("\\s", "");

        System.out.println("Input string: " + input);
        System.out.println("Output string: " + output);

    }
}
