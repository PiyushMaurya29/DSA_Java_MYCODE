package Char_Datatype;
import java.util.Scanner;
public class CharData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'P';
        int x = (int)ch; // Or int x = ch is also valid
        System.out.println(x);
        System.out.println(ch);


        // How to take input char data type
        System.out.print("Enter character : ");
        char key = sc.next().charAt(0);

        System.out.println(key);
    }
}
