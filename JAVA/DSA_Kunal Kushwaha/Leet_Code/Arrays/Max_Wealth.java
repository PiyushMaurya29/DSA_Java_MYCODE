package Leet_Code.Arrays;
// Q. https://leetcode.com/problems/richest-customer-wealth/
public class Max_Wealth {
    public static int maximumWealth(int accounts[][]){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {  // person = row
            // When you start a new col , take a new sum for that row
            int rowSum = 0;
            for (int account = 0; account < accounts[person].length ; account++) { // accounts = col
                rowSum += accounts[person][account];
            }
            if(rowSum>ans){
                ans = rowSum;
            }
        }
        return ans;
    }
    public static void main(String[] args) {



    }
}
