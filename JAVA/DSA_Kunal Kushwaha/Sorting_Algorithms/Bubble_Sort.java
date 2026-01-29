package Sorting_Algorithms;

import java.util.Arrays;

public class Bubble_Sort {
    static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void bubbleSort(int arr[]){
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step , max item will come at the last respective index
            for(int j = 1 ; j < arr.length-i ; j++){
                // swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
//                    swap(arr,j,j-1);
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i , it means the array is sorted hence stop the programme
            if(!swapped){  // Or swapped == false
                break;
            }
        }
    }
    public static void main(String[] args) {

        /*
           Bubble Sort :
           * In each pass the largest element come at the last place
           * As the size of array growing , the number of comparisons is growing
           * It is stable sorting algorithm
             For example : 10 20 20 30 10
                  Sorted : 10 10 20 20 30
                  The order of 10 and 20 is maintained that is why it is stable sorting algorithm

           Time complexity :
           * Best Case : O(N)
           * Worst Case : O(N^2)

           NOTE : When j never swaps in a pass of i , it means the array is sorted
         */

        int arr[] = {5,-99,4,-9,-44,3,2,1};
        System.out.print("Before Sorting : ");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.print("After sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}
