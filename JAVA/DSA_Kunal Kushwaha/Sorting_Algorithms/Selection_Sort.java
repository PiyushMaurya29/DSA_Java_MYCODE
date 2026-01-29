package Sorting_Algorithms;

import java.util.Arrays;

public class Selection_Sort {    static int getMaxIndex(int arr[] , int start , int end){
    int maxEleIdx = start;
    for(int i=start ; i<=end ; i++){
        if(arr[maxEleIdx] < arr[i]){
            maxEleIdx = i;
        }
    }
    return maxEleIdx;
}
    static void swap(int arr[] , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void selectionSort(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            // find the max item in the remaining array and swap with correct index
            int lastIdx = arr.length-i-1; // for each pass
            int maxIndex = getMaxIndex(arr,0,lastIdx);

            swap(arr , maxIndex , lastIdx);
        }
    }

    public static void main(String[] args) {
        /*
           * In each pass we select and put maximum element at last position/index

            Selection Sort :
            Worst Case : O(N^2)
             Best Case : O(N^2)

            * It is not a stable algorithm is that it is an unstable algorithm
            * It performs well on small lists / arrays
         */

        int arr[] = {-43,23,-12,455,66,7,75,123,56};
        System.out.print("Before Sorting : ");
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);

        System.out.print("After sorting : ");
        System.out.println(Arrays.toString(arr));

    }
}
