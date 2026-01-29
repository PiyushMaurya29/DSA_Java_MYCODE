package Sorting_Algorithms;

import java.util.Arrays;

public class Insertion_Sort {
    static void swap(int arr[] , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void insertionSort(int arr[]){
        for(int i=0 ; i<arr.length-1 ; i++){ // Or write i <= arr.length-2
            for(int j=i+1 ; j>0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr , j , j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        /*
            Insertion Sort : For every index , Put that index element at the correct index of LHS.

            Time Complexity :
            Worst Case : O(N^2)
            Best Case : O(N)

            Why we use insertion Sort?
            * Adaptive , it means steps gets reduced if array is sorted
            * Number of swaps is reduced as compared to bubble sort
            * It is stable
            * Used for smaller values of N , works good when array is partially sorted
              That's why it takes part in hybrid sorting algorithms
         */

        int arr[] = {-43,23,-12,455,66,7,75,123,56};
        System.out.print("Before Sorting : ");
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        System.out.print("After sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}
