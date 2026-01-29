package Strings.String_Questions;
import java.util.*;
import java.lang.String;
public class Swap_Two_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string : ");
        String str2 = sc.nextLine();

        System.out.println("Before Swapping : ");
        System.out.println("str1 = "+str1);
        System.out.println("Str2 = "+str2);

        // Swap the values of str1 and str2 using XOR
        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("After Swapping : ");
        System.out.println("str1 = "+str1);
        System.out.println("str2 = "+str2);
    }
}
