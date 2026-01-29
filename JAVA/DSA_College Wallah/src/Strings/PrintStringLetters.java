package Strings;
import java.util.*;
public class PrintStringLetters {
    static void printStringLetters(String str){
        for(int i=0 ; i<str.length() ; i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER String : ");
        String str = sc.nextLine();

        printStringLetters(str);
    }
}
