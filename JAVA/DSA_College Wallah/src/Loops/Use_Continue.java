package Loops;
import java.util.Scanner;
public class Use_Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Print all the values between 1 and 50 except for the multiple of 3.


        System.out.print("Enter the number till you want to print : ");
        int num = sc.nextInt();

        for(int i=1 ; i<=num ; i++) {
            // Another Method if(i%3!=0) System.out.println(i);
            if(i%3==0) {continue;}
            System.out.println(i);
        }

        //Using while loop
        int n = 1;
        while (n<=num){
            if(n%3==0){
                n++;
                continue;
            }
            System.out.println(n);
            n++;
        }

    }
}
