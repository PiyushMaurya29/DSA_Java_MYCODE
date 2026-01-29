package Recursion.Sorting;

import java.util.Arrays;

public class Merge_Sort {
    static int[] mergeSort(int arr[]){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int left[] = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left , right);
    }
    static int [] merge(int first[] , int second[]){
        int mix[] = new int[first.length + second.length];
        int i = 0;  // pointer for first array
        int j = 0;  // pointer for second array
        int k = 0;  // pointer for new mix array

        while (i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // It may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
    public static void main(String[] args) {

        int arr[] = {4,5,62,7,22};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
