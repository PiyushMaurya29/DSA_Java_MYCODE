package Loops;
import java.util.Scanner;
public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Count number of Digits
        System.out.print("Enter the Digit : ");
        int num = sc.nextInt();
        int Original_num = num;
        int numofdigits = 0;

        //Using for loop
//        for (int i=0 ; num>0 ; i++){
//            if(num==0) break;
//            numofdigits++;
//            num = num / 10;
//
//        }
//        System.out.println("The number of digits in "+Original_num+" are "+numofdigits);
//
        //Using while loop
        while (num>0){
            num = num / 10;
            numofdigits++;
        }
        System.out.println("The number of digits in "+Original_num+" is "+numofdigits);
    }
}
