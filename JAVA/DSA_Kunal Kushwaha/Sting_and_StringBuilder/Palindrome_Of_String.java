package Sting_and_StringBuilder;

import java.util.Scanner;

public class Palindrome_Of_String {
    static boolean isPalindrome(String str){
        if(str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        int n = str.length();
        boolean check = true;
        for(int i=0 ; i<n ; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                check = false;
            }
        }
        return check;
    }

    // 2nd Method
    static boolean isPalindrome2(String str){
        if(str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        for(int i=0 ; i<=str.length()/2 ; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-i-1);
            if(start != end){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
           Palindrome examples :- aba , abcba , lol , chhc
         */

        System.out.print("Enter string : ");
        String str = sc.nextLine();

        if(isPalindrome(str)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }

    }
}
