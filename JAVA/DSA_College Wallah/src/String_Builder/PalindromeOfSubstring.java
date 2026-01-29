package String_Builder;
import java.util.*;

public class PalindromeOfSubstring {
    public static boolean isPalindrome(String s){
        int i=0 , j=s.length()-1;
        boolean flag = true;
        while (j>i){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Given a string s , return the number of palindromic substring in it.
          Input s = "abc"
          Number of substring -> a , ab , abc , b , bc , c
          Output(Number of substring)  =  3
         */

        String str = "abbd";
        int count = 0;
        for(int i=0 ; i<str.length() ; i++){
            /* In second loop we used i+1 and str.length()+1 because when we give
            range of for example (1,4) means we are including 1 to 4-1 elements
             */
            for(int j=i+1 ; j<str.length()+1 ; j++){
                if(isPalindrome(str.substring(i,j))==true){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println("\nNumber of Palindromic Substrings : "+count);

    }
}
