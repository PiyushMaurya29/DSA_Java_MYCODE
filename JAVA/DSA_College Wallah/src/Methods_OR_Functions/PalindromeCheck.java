package Methods_OR_Functions;
import java.util.*;
public class PalindromeCheck {
    static boolean isPalindrome(int n){
        int originalNum = n;
        int reverseNum = 0;

        while (n != 0){
            int rem = n % 10;
            reverseNum = reverseNum * 10 + rem;
            n = n / 10;
        }
        if(originalNum==reverseNum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Write a Java program to check if a number is a palindrome(121 is a palindrome, 321 is not)
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println("Number "+num+" is a palindrome");
        }
        else{
            System.out.println("Number "+num+" is not a palindrome");
        }
    }
}
