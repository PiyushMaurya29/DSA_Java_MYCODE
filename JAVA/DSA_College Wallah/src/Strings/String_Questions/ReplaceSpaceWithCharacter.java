package Strings.String_Questions;
import java.util.*;
public class ReplaceSpaceWithCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String input = sc.nextLine();

        System.out.print("Enter the character to replace with spaces with : ");
        char replacement = sc.next().charAt(0);

        // Replace all the spaces with the specified character
        String output = input.replace(' ',replacement);

        System.out.println("Input string : "+input);
        System.out.println("Output string : "+output);
    }
}
