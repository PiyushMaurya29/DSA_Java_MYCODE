package Recursion.Basic_Recursion;

public class BinarySearch_Recursion {
    static int BS_Recursively(int arr[] , int target , int start , int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;

        if(arr[mid] == target) return mid;
        if(arr[mid] > target){
            return BS_Recursively(arr , target , start ,mid-1);
        }
        return BS_Recursively(arr , target ,mid+1 , end);
    }
    public static void main(String[] args) {

        /*
           BS using recursion
           1. Comparing -> O(1)
           2. Dividing into two halves

           Recurrence relation : F(N) = O(1) + F(N/2)
         */

        int arr[] = {1,234,556,765,4321,23345};
        int target = 765;

        System.out.println(BS_Recursively(arr,target,0,arr.length-1));
    }
}
