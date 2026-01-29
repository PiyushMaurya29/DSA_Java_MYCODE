package String_Builder;
import java.util.*;
public class CheckPelindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First Method
//        String str = "abcdcba";
//        StringBuilder gtr = new StringBuilder(str);
//        gtr.reverse();
//        String s = gtr + "";
//        if(str.equals(s)) System.out.println("Palindrome");
//        else System.out.println("Not Palindrome");

        String str = "abcdcba";
        int i=0 , j=str.length()-1;
        boolean flag = true;  // true means palindrome
        while (j>i){
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if(flag==true) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}
