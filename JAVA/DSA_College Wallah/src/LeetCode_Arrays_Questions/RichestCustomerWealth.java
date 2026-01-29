package LeetCode_Arrays_Questions;
import java.util.*;
// https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for(int person=0 ; person<accounts.length ; person++){
            // when you start a new col , take a new sum for that row
            int sum = 0;
            for(int account=0 ; account<accounts[person].length ; account++){
                sum += accounts[person][account];
            }
            // now we have sum of accounts of person , check with overall answer
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    }
}
