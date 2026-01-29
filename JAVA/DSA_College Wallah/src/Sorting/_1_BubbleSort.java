package Sorting;
import java.util.*;
public class _1_BubbleSort {
    // Time Complexity : BestCase(Sorted) = O(N) : WorstCase(UnSorted) = O(N^2)
    // Space Complexity : O(1) As no extra space is required
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){
            boolean checkSwap = false;
            for(int j=0 ; j<n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    checkSwap = true;
                }
            }
            if(checkSwap == false) break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // We will compare each adjacent elements and move the largest element at the end on every iteration
        // This is also known as sinking sort and exchange sort
        // Inplace sorting Algorithm
        // Stable Sorting when original order of equal elements are maintained
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array : ");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Sorted Array : ");
        System.out.println(Arrays.toString(arr));
    }
}
