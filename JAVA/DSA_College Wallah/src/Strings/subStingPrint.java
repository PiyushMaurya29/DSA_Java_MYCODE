package Strings;
import java.util.Scanner;
import java.util.*;
public class subStingPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Given a string s , print all the substring of s
           //Only takes smaller parts of string
           Input s = "abcd"
           Output : a ab abc abcd
                    b bc bcd
                    c cd
                    d
         */
        System.out.print("Enter String : ");
        String str = sc.nextLine();  //Example str = "abcd"

        // code example
        for(int i=0 ; i<=3 ; i++){
            for(int j=i+1 ; j<=4 ; j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
        System.out.println();

        // general code
        for(int i=0 ; i<str.length() ; i++){
            /* In second loop we used i+1 and str.length()+1 because when we give
            range of for example (1,4) means we are including 1 to 4-1 elements
             */
            for(int j=i+1 ; j<str.length()+1 ; j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
