package Strings.String_Questions;
import java.util.*;
public class CheckString_Palindrome {
    static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0 ; i<n/2 ; i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                // Not a palindrome
                return false;
            }
        }
        return true;
    }
    static void isPalindrome_2(String str){
        // Reverse the input string using StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();

        // Compare the input string with its reversed form
        if(str.equals(reversed)){
            System.out.println("The input string is a palindrome");
        }else {
            System.out.println("The input string is not a palindrome");
        }
    }
    static boolean isPalindrome3(String str){
        int n = str.length();
        int i=0, j=n-1;
        while (i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Check if a string is a Palindrome or not
        // Example : "racecar" , "noon" , "madam"

        System.out.print("Enter String : ");
        String str = sc.nextLine();
        boolean check = isPalindrome(str);
        if(isPalindrome(str)){
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String is not a Palindrome");
        }
        isPalindrome_2(str);
        System.out.println(isPalindrome3(str));
//        boolean check = true;
//        int n = str.length();
//        for(int i=0 ; i<n/2 ; i++){
//            if(str.charAt(i) != str.charAt(n-i-1)){
//                check = false;
//            }
//        }
//        if(check == true) System.out.println("String is Palindrome");
//        else System.out.println("String is not Palindrome");
    }
}
