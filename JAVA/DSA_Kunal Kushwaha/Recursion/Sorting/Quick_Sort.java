package Recursion.Sorting;

import java.util.Arrays;

public class Quick_Sort {
    static void quickSort(int nums[] , int low , int high){
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        // also a reason why if its already sorted it will not swap
        while (s <= e){
            while (nums[s] < pivot){
                s++;
            }
            while (nums[e] > pivot){
                e--;
            }
            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
            // now my pivot is at correct index , please sort two halves
            quickSort(nums , low , e);
            quickSort(nums , s , high);
        }
    }
    public static void main(String[] args) {
        /*
            * Quick Sort
            * Pivot : Choose any element -> After first pass
            * All the element less than pivot will be on LHS of pivot
            * All the element greater than pivot will be on RHS of pivot
         */

        int arr[] = {5,4,3,2,1,0};
        quickSort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
