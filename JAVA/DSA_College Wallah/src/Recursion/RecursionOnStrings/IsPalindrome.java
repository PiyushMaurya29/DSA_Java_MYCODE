package Recursion.RecursionOnStrings;

import java.util.Objects;
import java.util.Scanner;

public class IsPalindrome {
    static String reverseString(String str, int idx){
        // TC = O(N^2)
        if(idx == str.length()) return "";
        return reverseString(str, idx+1) + str.charAt(idx);
    }
    static boolean isPalindrome(String s, int l, int r){
        if(l >= r){
            return true;
        }
        if(s.charAt(l) != s.charAt(r)){
            return false;
        }
        return isPalindrome(s, ++l, --r);
    }
    static boolean isPalindrome2(String s, int l, int r){
        // TC and SC = O(N) => N is number of letters in string or Number of calls made
        if(l >= r) return true;
        return (s.charAt(l) == s.charAt(r) && isPalindrome(s, l+1, r-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string : ");
        String str = sc.nextLine();   // Examples : dad, level, pop, radar

        String rev = reverseString(str, 0);

        if(rev.equals(str)){
            System.out.println(str+" is Palindrome");
            System.out.printf("%s is Palindrome",str);
        }else {
            System.out.println(str+" is not Palindrome");
            System.out.printf("%s is not Palindrome",str);
        }
        System.out.println();
        System.out.println(isPalindrome(str, 0, str.length()-1));
        System.out.println(isPalindrome2(str, 0, str.length()-1));
    }
}
