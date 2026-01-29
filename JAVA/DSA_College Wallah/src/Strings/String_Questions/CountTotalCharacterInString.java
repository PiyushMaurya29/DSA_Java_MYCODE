package Strings.String_Questions;
import java.util.*;
public class CountTotalCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        int count = 0;

        // Count the number of character in the String.
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("Total number of character : "+count);
    }
}
