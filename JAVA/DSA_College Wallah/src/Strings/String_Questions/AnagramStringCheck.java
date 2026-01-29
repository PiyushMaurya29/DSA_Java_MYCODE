package Strings.String_Questions;
import java.util.*;
public class AnagramStringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String is another string with exactly the same quantity of each character in it, in any order

        System.out.print("Enter the first String : ");
        String first = sc.nextLine().toLowerCase();
        System.out.print("Enter the second string : ");
        String second = sc.nextLine().toLowerCase();

        // Convert the string to character Array
        char firstArray[] = first.toCharArray();
        char secondArray[] = second.toCharArray();

        // Sort the character arrays
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        // Compare the sorted character arrays
        if(Arrays.equals(firstArray,secondArray)){
            System.out.println("The two strings are anagrams.");
        }else {
            System.out.println("The two strings are not anagrams.");
        }
    }
}
