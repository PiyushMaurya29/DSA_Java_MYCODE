package Recursion.RecursionOnArrays;
import java.util.Scanner;
public class MaxValueOfArray_Recursion {
    static int findMaxValueOfArray(int arr[] , int index){
        //base case
        if(index == arr.length - 1){
            return arr[index];
        }
        //small problem -> index+1 , end of the array -> max -> recursive
        int smallAns = findMaxValueOfArray(arr,index+1);
        //self work and final ans
        return Math.max(arr[index],smallAns);
    }
    static int findMaxValueOfArray2(int arr[], int idx, int max){
        if(idx == arr.length-1){
            return max;
        }
        if(arr[idx+1] > arr[idx]){
            return findMaxValueOfArray2(arr, idx+1, arr[idx+1]);
        }
        return findMaxValueOfArray2(arr, idx+1, max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int index = 0;
        System.out.println("Maximum element : "+findMaxValueOfArray2(arr,index,Integer.MIN_VALUE));
    }
}
