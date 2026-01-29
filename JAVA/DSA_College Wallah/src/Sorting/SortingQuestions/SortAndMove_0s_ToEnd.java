package Sorting.SortingQuestions;
import java.util.*;
public class SortAndMove_0s_ToEnd {
    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sort0(int arr[]){
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[i]!=0){
                    continue;
                }
                if(arr[i]==0 && arr[j]!=0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void moveZeroes(int arr[]){
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){
            for(int j=0 ; j<n-i-1 ; j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Q. Given an integer array arr , move all 0's to the end of it
             while maintaining the relative order of the non-zero elements
             Note that you must do this in-place without making a copy of the array

             Example : Input : 0 5 0 3 4 2
                       Output : 5 3 4 2 0 0   // Relative order should be maintained
         */

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        moveZeroes(arr);
        printArray(arr);
    }
}
