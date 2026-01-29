package Strings.String_Questions;
import java.util.*;
public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // In substring(i,j) i is included but j is excluded
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        System.out.println("Number of substring : ");
        int n = str.length();
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n+1 ; j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
