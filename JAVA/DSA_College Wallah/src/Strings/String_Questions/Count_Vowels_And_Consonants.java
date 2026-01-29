package Strings.String_Questions;
import java.util.*;
public class Count_Vowels_And_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Java Program to count the total number of vowels and consonants in a string
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        // Converting Capital to small letters
        str = str.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        // Count the number of vowel and consonants in the String
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowelCount++;
                }else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Total number of vowels : "+vowelCount);
        System.out.println("Total number of consonants : "+consonantCount);

    }
}
