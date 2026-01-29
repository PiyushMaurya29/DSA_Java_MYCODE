package Loops;
import java.util.Scanner;
public class N_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number till you want numbers : ");
        int num = sc.nextInt();

        //Using for loop
        for (int i=1 ; i<=num ; i++){
            System.out.println(i);
        }

        //Using while loop
        int i=1;
        while (i<=num){
            System.out.println(i);
            i++;
        }
    }
}
