package Char_Datatype;
import java.util.*;
public class Char_Check_Capital_OR_Small {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character : ");
        char ch = sc.next().charAt(0);

        if(ch>='A' && ch<='Z'){
            // Or use 65 && 90 instead of A and Z
            System.out.println("Capital letter or UpperCase");
        }
        else if(ch>='a' && ch<='z'){
            // Or use 97 && 122 instead of a and z
            System.out.println("Small letter or LowerCase");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
