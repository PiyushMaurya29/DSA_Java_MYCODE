package Basics;
import java.util.Scanner;
public class Taking_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word : ");
        String word = sc.next(); //Takes input till you enter a space
        System.out.println("The entered word is "+word);

        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        System.out.println("The entered character is "+ch);


        System.out.print("Enter a sentence : ");
        String sentence = sc.nextLine(); //Takes input either after a space
        System.out.println("The entered sentence is : "+sentence);

    }
}
