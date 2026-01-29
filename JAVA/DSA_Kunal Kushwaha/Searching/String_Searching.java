package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class String_Searching {
    static boolean search_Char(String str , char target){
        if(str.length()==0){
            return false;
        }
        for(int i=1 ; i<=str.length() ; i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Searching character in a string

        String name = "Shaurya Pratap";
        char target = 'u';

        // Printing string into characters

        System.out.println(Arrays.toString(name.toCharArray()));

        if(search_Char(name,target)){
            System.out.println("Character is present in String");
        }
        else{
            System.out.println("Character is not present in String");
        }

    }
}
