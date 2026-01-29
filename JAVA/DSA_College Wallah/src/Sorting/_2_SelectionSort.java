package Sorting;
import java.util.*;
public class _2_SelectionSort {
    static int getMaxIndex(int arr[] , int start , int end){
        int max = start;
        for(int i=start ; i<=end ; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int arr[] , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void selectionSort(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            // find the max item in the remaining array and swap with correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr , maxIndex , last);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Time complexity : WorstCase = O(N^2) : BestCase = O(N^2)
        // It performs well in small lists

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array : ");
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("Sorted Array : ");
        System.out.println(Arrays.toString(arr));
    }
}
