package Strings.String_Questions;
import java.util.*;
public class String_Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if(s1==s2){
            System.out.println("String are equal");
        }
        else {
            System.out.println("String are not equal");
        }

        if(s1==s3){
            System.out.println("String are equal");
        }
        else {
            System.out.println("String are not equal");
        }

        if(s1.equals(s3)) System.out.println("Sting are equal");
        else System.out.println("String are not equal");

    }
}
