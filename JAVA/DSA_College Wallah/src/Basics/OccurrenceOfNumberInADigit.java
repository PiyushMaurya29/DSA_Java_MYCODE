package Basics;
import java.util.*;
public class OccurrenceOfNumberInADigit {
    static int findNumOfOccurrence(int digit , int countNum){
        int count = 0;
        while(digit != 0){
            int lastDigit = digit % 10;
            if(lastDigit == countNum){
                count++;
            }
            digit /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Find the number of occurrence of number in a digit.
           For Example : 138377897
           Answer for 7 : 3
         */

        System.out.print("Enter Digit : ");
        int digit = sc.nextInt();

        System.out.print("Enter number you want to count in Digit : ");
        int countNum = sc.nextInt();

        System.out.println("Number of occurrence of "+countNum+" : "+findNumOfOccurrence(digit,countNum));
    }
}
