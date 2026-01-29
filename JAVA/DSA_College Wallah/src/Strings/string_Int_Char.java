package Strings;
import java.util.Scanner;
import java.util.*;
public class string_Int_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "abc";
        System.out.println(str+"zzz"+"rrr");
        System.out.println(str+100+90); //because of left to right precedence
        System.out.println(str+(100+500));  //because brackets has more precedence
        System.out.println(100+50+"abc");
        str = str + " xyz" + " pq" + 'r';  // or use +=
        str += 100;  //Integer will convert in string first then add
        System.out.println(str);


    }
}
