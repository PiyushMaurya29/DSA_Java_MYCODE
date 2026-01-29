package IF_ELSE;
import java.util.Scanner;
public class Number_5_3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

//        if(num%3==0 || num%5==0){
//            if(num%15!=0) System.out.println("Divisible by 5 or 3 but not 15");
//            else System.out.println("Not matching condition");
//        }
//        else System.out.println("Not matching condition");
        if((num%3==0 || num%5==0) && num%15!=0){
            System.out.println("Number is divisible by 3 or 5 but not 15.");
        }
        else {
            System.out.println("Not matching required condition");
        }
    }
}
