package Sorting;
import java.util.*;
public class _3_InsertionSort {
    static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void insertionSort(int arr[]){
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=i+1 ; j>0 ; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Time Complexity : WorstCase : O(N^2) : Best Case O(N)

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array : ");
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("Sorted Array : ");
        System.out.println(Arrays.toString(arr));

    }
}
