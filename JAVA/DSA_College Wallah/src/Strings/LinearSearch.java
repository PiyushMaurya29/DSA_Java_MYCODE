package Strings;
import java.util.*;
public class LinearSearch {
    static boolean charSearch(String str , char ch){
        if(str.length() == 0) return false;
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Search a character in string.

        String str = "Shaurya";
        char target = 'r';

        System.out.println(charSearch(str,target));
    }
}
