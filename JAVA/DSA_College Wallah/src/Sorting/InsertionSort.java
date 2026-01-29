package Sorting;
import java.util.*;
public class InsertionSort {

    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1 ; i<n ; i++){
            int j = i;
            while (j>0  && arr[j]<arr[j-1]){  // Write j>0 before arr[j]<arr[j-1]
                                               // because in && operator it works left to right
                //swap arr[j] , arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    static void insertionSorting(int arr[]){
        int n = arr.length;
        for(int i=1 ; i<n ; i++){
            int currEle = arr[i];
            int prevEle = i-1;
            // Finding out current position to insert
            while (prevEle>=0 && arr[prevEle]>currEle){
                arr[prevEle+1] = arr[prevEle];
                prevEle--;
            }
            //insertion
            arr[prevEle+1] = currEle;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pick an element from unsorted part and place in the right position in sorted part

        /* PrincipalOfInsertion > Take one element , iterate through
           the sorted and find the correct position of this element
         */
        /* Stable sorting taking place
         * Application of insertion is best when some part of array is already sorted
         */

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        //insertionSort(arr);
        insertionSorting(arr);

        //Printing array using (for each) method
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
}
