package Methods_OR_Functions;
import java.util.*;
public class ArmstrongNumber {
    static boolean isArmstrong(int n){
        int originalNum = n;
        int sumOfCubes = 0;
        while (n > 0){
            int rem = n % 10;
            n /= 10;
            sumOfCubes += (rem * rem * rem);
        }
//        if(sumOfCubes == originalNum){
//            return true;
//        }
//        return false;
        return sumOfCubes == originalNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Armstrong number is a number in which sum of each
           individual digit of a number is equal to that number
           is called Armstrong number.
         */

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        boolean ans = isArmstrong(n);
        System.out.println(ans);
//        System.out.println(isArmstrong(n));

        // Printing first n Armstrong numbers
        for(int i=100 ; i<1000 ; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }

    }
}
