package Recursion;

import java.util.Arrays;

public class _1_ReverseArray {
    public static void swap(int arr[], int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    public static void reverseArray(int arr[], int s, int e){
        if(s>=e) return;
        swap(arr, s, e);
        reverseArray(arr, s+1, e-1);
    }
    public static int fibonacci(int n){
        // TC = O(2^n)
        if(n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void reverseArray2(int arr[], int idx){
        if(idx>arr.length/2) return;
        swap(arr, idx, arr.length-idx-1);
    }
    public static void main(String[] args) {
        int arr[] = {10, 23, 43, 88, 9};
        int n = arr.length;
//        reverseArray(arr, 0, n-1);
//        System.out.println(Arrays.toString(arr));
        reverseArray2(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
