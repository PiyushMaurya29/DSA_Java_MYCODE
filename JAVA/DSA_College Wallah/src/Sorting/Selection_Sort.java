package Sorting;
import java.util.Scanner;
public class Selection_Sort {
    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sortBySelecting(int arr[]){
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){  // i represent the current index.
            // Find the minimum element in unsorted part of array
            int minIndex = i;
            for(int j=i+1 ; j<n ; j++){
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap current element and minimum element -> current index i will have correct element
            // arr[minIndex] , arr[i]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Selects an element and puts it at its correct position
         * Unstable sorting taking place
         * It is an inplace sorting algorithm
         */

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        sortBySelecting(arr);
        printArray(arr);
    }
}
