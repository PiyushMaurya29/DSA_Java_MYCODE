package Loops;
import java.util.Scanner;
public class Table_of_any_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number which table you want : ");
        int num = sc.nextInt();

        for(int i=1 ; i<=10 ; i++){
            System.out.println(num+" X "+i+" = "+(num*i));
        }
    }
}
