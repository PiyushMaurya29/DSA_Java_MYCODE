package Loops;
import java.util.*;
public class Basic_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            Syntax of for Loops :
            for(initialization ; condition ; update(increment / decrement){
                            // body
               }

             while(condition){
                    // body
                  }

              do {

                // body

                }(condition)

         */
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        for(int i=1 ; i<=num ; i++){
            System.out.print(i+" ");
        }

        System.out.println();

        int i = 1;
        while (i <= num){
            System.out.print(i+" ");
            i++;
        }
    }
}
