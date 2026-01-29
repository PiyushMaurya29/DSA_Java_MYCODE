package Strings.String_Questions;
import java.util.*;
public class ReplaceUpperToLowerAndViseVersa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Java Program to replace lower-case characters with upper-case and vice-versa

        System.out.print("Enter a String : ");
        String input = sc.nextLine();
        StringBuilder output = new StringBuilder(input);

        // Swap the case of each character in the String
        for(int i=0 ; i<input.length() ; i++){
            char ch = input.charAt(i);
            if(Character.isUpperCase(ch)){
                output.setCharAt(i,Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                output.setCharAt(i,Character.toUpperCase(ch));
            }
        }

        System.out.println("Input String : "+input);
        System.out.println("Output String : "+output.toString());

    }
}
