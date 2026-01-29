package Sorting;

import java.util.Scanner;

public class QuickSort {
    static void displayArr(int arr[]){
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
    static void swap(int arr[], int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void quickSort(int arr[], int st, int end){
        if(st >= end) return;

        int pi = partition(arr, st, end);  // Partition index
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }
    static int partition(int arr[],  int st, int end){
        int pivot = arr[st];
        int count = 0; // elements lesser than pivot

        for(int i=st+1 ; i<=end ; i++){
            if(arr[i] <= pivot) count++;
        }
        int pivotIdx = st + count;

        swap(arr, st, pivotIdx);

        int i = st, j = end;
        // elements lesser or equal left , greater right side of pivotIdx
        while (i < pivotIdx && j > pivotIdx){
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if(i < pivotIdx && j > pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            Inplace Algorithm ,
            Time Complexity :-
            Worst Case => O(n^2) // This can be avoided easily using randomized QS.
            Average / Best Case => O(nlog(n))
         */

        int arr[] = {6, 3, 1, 5, 11, 4, 6};
        System.out.println("Array before sorting : ");
        displayArr(arr);
        System.out.println();

        quickSort(arr, 0, arr.length-1);

        System.out.println("Array after sorting : ");
        displayArr(arr);
    }
}
