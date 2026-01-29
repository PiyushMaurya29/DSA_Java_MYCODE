package Basics;
import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int count = 0;
        for(int i=1 ; i<=num ; i++){
            if(num%i==0) count++;
        }
        if(count==2) System.out.println("Number is prime");
        else System.out.println("Number is not prime");


        //2nd Method
        boolean check = true;
        for(int i=2 ; i<num ; i++){
            if(num%i==0){
                System.out.println("Not Prime");
                check = false;
                break;
            }
        }
        if(check==true) System.out.println("Prime");



    }
}
