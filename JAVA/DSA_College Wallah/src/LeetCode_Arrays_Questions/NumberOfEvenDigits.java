package LeetCode_Arrays_Questions;
import java.util.*;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class NumberOfEvenDigits {
    static int findNumbersEvenDigit(int nums[]){
        int count = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(evenDigit(nums[i])){
                count++;
            }
        }
        return count;
    }
    // function to check whether a number contains even digits or not
    static boolean evenDigit(int num){
        if(num < 0){
            num = num * -1;
        }
        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }
        return count % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = {12,345,2,6,7896};
        System.out.println(findNumbersEvenDigit(nums));
    }
}
