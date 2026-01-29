package Strings;
import java.util.Scanner;
import java.util.*;
public class subStrings {
    static String subString(String str , int si , int ei){
        String substring = "";
        for(int i=si ; i<ei ; i++){
            substring += str.charAt(i);
        }
        return substring;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //subString is continuous part of a string

//        String str = "abcde fghi";
//        System.out.println(str.substring(1,4));  //first is included but last is excluded
//        System.out.println(str.substring(3)); //prints whole string from given index
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        System.out.println(subString(str,0,5));

    }
}
