package Recursion.RecursionOnArrays;
import java.util.Scanner;
public class TargetSum_X_Recursion {
    static boolean targetValueSearch(int arr[] , int target ,  int index){
        int n = arr.length;
        //base case
        if(index >= n) return false;

        //self work
        if(arr[index] == target) return true;

        //recursive work
        return targetValueSearch(arr,target,index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Q. Given an array of n integer and a target value x .
             Print whether x exists in the array or not.

             Constraints : 0<=n<=10^6 ,  10^-8<=x<=10^8 , 10^-8<=a[i]<=10^8
             Input 1 : n=8 , x=14 , array = {4,12,23,45,8}
             Output 1 : YES
             Input 2 : n=1 , x=9 , arr = {34,3,5}
             Output 2 : NO
         */

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value (X) : ");
        int target = sc.nextInt();

        int index = 0;

        if(targetValueSearch(arr,target,index)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
