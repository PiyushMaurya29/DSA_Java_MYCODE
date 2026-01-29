package Strings;
import java.util.*;  // * imports everything
public class OperationOnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Hello Ji Ji";

        // .length() -> tells about length of string
        int len = str.length();
        System.out.println(len);
        System.out.println(str.length());

        // .charAt() -> tells about the character present at the index given
        char ch = str.charAt(3);
        System.out.println(ch);
        System.out.println(str.charAt(4));

        // .indexOf() -> tells about the index of the entered character of first occurrence
        System.out.println(str.indexOf("J"));

        /* .compareTo()
           * Lets assume two strings -> str and gtr
           * if  str == gtr two strings are exactly same then it returns 0.
           * if str > gtr lexicographically it gives positive value
           * if str < gtr lexicographically it gives negative value
           * lexicographically means it checks character wise (ascii values) to the string
         */

        String vtr = "Dello";
        String gtr = "Yello";
        System.out.println(vtr.compareTo(gtr)); // As Y is greater than D it gives negative value

        String yyy = "Hello Yellow Fellow";
        System.out.println(yyy.contains("ellow")); //If string is present it gives true
        System.out.println(yyy.startsWith("Hello")); //It tells that sting starts with given string or not
        System.out.println(yyy.endsWith(" Fellow"));

        String uuu = "JAI ho jai HO";
        System.out.println(uuu.toLowerCase()); // makes sting to lower case
        System.out.println(uuu.toUpperCase()); // makes string to upper case
        System.out.println(uuu.concat(yyy));   //concatenate two strings

    }
}
