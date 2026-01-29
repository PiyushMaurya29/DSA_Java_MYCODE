package Recursion.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort_InPlace {
    static void mergeSortInPlace(int arr[] , int s , int e){
        if(e - s == 1){
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSortInPlace(arr , s , mid);
        mergeSortInPlace(arr , mid , e);

        mergeInPlace(arr,s,mid,e);
    }
    static void mergeInPlace(int arr[] , int s , int m , int e){
        int mix[] = new int[e - s];
        int i = s;  // pointer for starting
        int j = m;  // pointer for mid
        int k = 0;  // pointer for merged answer Array

        while (i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // It may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0 ; l<mix.length ; l++){
            arr[s+l] = mix[l];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {34,5,67,12,87,31};
        mergeSortInPlace(arr , 0 , arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
