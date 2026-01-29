package Strings;
import java.util.*;
public class StringConcatenation {
    static void printLetters(String str){
        for(int i=0 ; i<str.length() ; i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String fullName = "Piyush Maurya";
        //Concatenation of strings means adding two or more strings.

        String firstName = "Tony";
        String lastName = "Maurya";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName + " is this");

        // Various functions of Strings
        System.out.println(fullName.charAt(5));
        printLetters(fullName);
    }
}
