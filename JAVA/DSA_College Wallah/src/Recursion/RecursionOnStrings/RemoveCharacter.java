package Recursion.RecursionOnStrings;

import java.util.Scanner;

public class RemoveCharacter {

    static String removeA(String str, String ans){
        if(str.isEmpty()){
            return ans;
        }
        if(str.charAt(0) == 'a'){
            return removeA(str.substring(1), ans);
        }
        return removeA(str.substring(1), ans+str.charAt(0));
    }
    static String removeA2(String str, int idx){
        /*
           TC = No. of calls * Time taken in 1 call
              = n * n => O(n^2)  // Time taken is constant except concatenation of string
         */
        // base case
        if(idx == str.length()) return "";

        // recursive work
        String smallAns = removeA2(str, idx+1);

        char currChar = str.charAt(idx);
        // self work
        if(currChar != 'a'){
            return currChar + smallAns;
        }else {
            return smallAns;
        }
    }
    static String removeA3(String s){
        if(s.length() == 0) return "";
        String smallAns = removeA3(s.substring(1));
        char currChar = s.charAt(0);
        if(currChar != 'a'){
            return currChar + smallAns;
        }else {
            return smallAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine(); // dcabca

        System.out.println(removeA(str, ""));

        System.out.println(removeA2(str, 0));
        /*
           TC = No. of calls * Time taken in 1 call
              = n * n => O(n^2)  // Time taken is constant except concatenation of string
         */
        System.out.println(removeA3(str));
    }
}
