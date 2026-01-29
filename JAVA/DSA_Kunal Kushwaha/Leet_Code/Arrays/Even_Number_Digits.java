package Leet_Code.Arrays;
// Q. https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Even_Number_Digits {
    // function to check whether a number contains even digits or not
    static boolean evenDigits(int num){
        int numberOfDigits = digits(num);
//        if(numberOfDigits % 2 == 0){
//            return true;
//        }
//        return false;
        return numberOfDigits % 2 == 0;
    }
    // count number of digits in a number
    static int digits(int num){
        if(num<0){
            num = num * -1;
        }
        if(num==0){
            return 1;
        }
        int count = 0;
        while (num>0){
            count++;
            num /= 10;
        }
        return count;
    }
    // 2nd way to find number of digits
    static int digits2(int num){
        if(num<0){
            num = num * -1;
        }
        return (int)(Math.log10(num)+1);
    }

    static int findNumbers(int nums[]){
        int count = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(evenDigits(nums[i])){
                count++;
            }
        }
        return count;
    }
    static int alternateMethod(int nums[]){
        int n = 0;
        for(int i=0 ; i<nums.length ; i++){
            int count = 0;
            while (nums[i]>0){
                count++;
                nums[i] /= 10;
            }
            if(count%2==0) n++;
        }
        return n;
    }
    public static void main(String[] args) {

        // Q. Find number of numbers having even number of digits
        int nums[] = {12,345,2,6,7896};

        System.out.println(findNumbers(nums));

        System.out.println(alternateMethod(nums));

    }
}
