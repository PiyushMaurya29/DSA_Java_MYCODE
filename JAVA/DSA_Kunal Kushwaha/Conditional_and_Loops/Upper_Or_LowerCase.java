package Conditional_and_Loops;

import java.util.Scanner;

public class Upper_Or_LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character : ");
        // .trim is used for removing extra spaces
        char ch = sc.next().trim().charAt(0);

        if(ch>='A' && ch<='Z'){
            System.out.println("Upper_Case");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("Lower_Case");
        }
        else{
            System.out.println("Invalid or Out of bound INPUT is given by user");
        }

    }
}
