package Strings.String_Questions;
import java.util.*;
public class PrintLargestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // For a given set of Strings , print the largest string in Lexicographic Order
        /* str1.compareTo(str2)
           Comparison does on basis of Lexicographically
           Use CompareToIgnoreCase to ignore small and capital letters
           Output : 0 If strings are equal
           Output : +ve If string 1 is larger than 2
           Output : -ve If string 1 is smaller than 2
         */

        System.out.print("Enter size of string array : ");
        int n = sc.nextInt();
        String str[] = new String[n];

        // String str[] = {"apple" , "mango" , "banana"};

        System.out.println("Enter "+n+" Strings : ");
        for(int i=0 ; i<n ; i++){
            str[i] = sc.next();
        }

        String largest = str[0]; //Assume first string is the largest one

        for(int i=1 ; i<str.length ; i++){
            if(largest.compareTo(str[i])<0){
                largest = str[i];
            }
        }

        System.out.println("Largest String : "+largest);
    }
}
