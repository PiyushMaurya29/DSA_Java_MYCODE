package Recursion.RecursionOnStrings;

import java.util.Scanner;

public class ReverseString {
    static String reverseString1(String up, String p){
        if(up.isEmpty()){
            return p;
        }
        return reverseString1(up.substring(1), up.charAt(0)+p);
    }
    static String reverseString2(String s, int idx){
        /*
            TC = O(n) => No. of stack calls made
            SC = O(n^2)  => No. of stack calls * Concatenation of String
         */
        if(idx == s.length()) return "";
//        String smallAns = reverseString2(s, idx+1);
        return reverseString2(s, idx+1) + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();

        System.out.println(reverseString1(str,""));
        System.out.println(reverseString2(str,0));

    }
}
