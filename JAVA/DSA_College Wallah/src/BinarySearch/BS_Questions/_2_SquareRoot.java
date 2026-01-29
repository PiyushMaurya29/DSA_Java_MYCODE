package BinarySearch.BS_Questions;

import java.util.Scanner;

public class _2_SquareRoot {
    static int method1(int n){
        return (int)(Math.sqrt(n));
    }
    static int method2(int n){
        int x = 0;
        while (x*x <= n){
            x++;
        }
        return x-1;
    }
    static int method3(int n){ // Most efficient method
        int s=0, e=n;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            int val = mid * mid;  // we can use long to avoid overflow
            if(val == n) return mid;
            else if(val < n){
                ans = mid;
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Find the square root of the given non-negative value x.
        // Round it off to the nearest floor integer value.
        /*
            Example :
            Input x = 4
            Output : 4
            Input x = 11
            Output : 3
         */
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println(method1(n));
        System.out.println(method2(n));
        System.out.println(method3(n));  // binary search
    }
}
