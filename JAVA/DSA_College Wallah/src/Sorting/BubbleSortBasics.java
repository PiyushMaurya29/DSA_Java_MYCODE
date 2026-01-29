package Sorting;
import java.util.Scanner;
public class BubbleSortBasics {
    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void bubbleSort(int arr[]){
        int n = arr.length;
        // n-1 iteration / passes
        for(int turn=0 ; turn<n-1 ; turn++){
            boolean swaps = false;  // has any swapping happened or not
            for(int j=0 ; j<n-turn-1 ; j++){
                //last i elements are already at correct sorted position
                //so no need to check them
                if(arr[j]>arr[j+1]){
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps = true;
                }
                }
            if(swaps == false){  // checking -> has any swaps happened
                return;  // Or write !flag implies flag == false
            }
        }
    }
    static void sortArray(int arr[]){
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<n ; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*We do a certainNumber (n-1) of passes and in every pass , we
        compare adjacent elements and swap them if they are not  in
        correct order.

         In every iteration , the largest number in every part of array
         to be processed gets its correct position.
         */

        /* Types of sort  5 4 3 2 *3
                 Stable : 2 3 *3 4 5
               Unstable : 2 *3 3 4 5
               Note -> Bubble sort is stable algorithm
                       Bubble sort is inplace algorithm means no extra space is used

            Time Complexity :
             Best case -> o(n)
             Worst case -> o(n^2)
             Average case -> o(n^2)
         */

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);
        // New way to print an array named as -> for each method
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
