package Recursion.RecursionOnArrays;
import java.util.*;
public class CheckArraySortedOrNot {
    static boolean checkArraySorted(int arr[] , int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return checkArraySorted(arr,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check if a given array is sorted (Ascending Order) or not.

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        if(checkArraySorted(arr,0)){
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array is not Sorted");
        }

    }
}
