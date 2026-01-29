package Sorting;
import java.util.*;
public class MergeSort {
    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void merge(int arr[] , int l , int mid , int r){
        int n1 = mid-l+1;  // left array size
        int n2 = r-mid;    // right array size
        int left[] = new int[n1];
        int right[] = new int[n2];
        int i , j , k ;
        for(i=0 ; i<n1 ; i++) left[i] = arr[l+i];
        for(j=0 ; j<n2 ; j++) right[j] = arr[mid+1+j];
        i = 0;
        j = 0;
        k = l;
        while (i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }
        while (i<n1){
            arr[k++] = left[i++];
        }
        while (j<n2){
            arr[k++] = right[j++];
        }
    }
    static void mergeSort(int arr[] , int l , int r){ // Generally l=0 and r=n-1
        if(l >= r) return;
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
           1. Divide the array into 2 equal halves
           2. Sort the 2 sub-arrays separately using recursion (Sub-problem)
           3. Merge the 2 sorted sub-arrays to create an overall sorted array (Self-work)
         */
        /*
            *It is a stable sorting algorithm
            TC = O(nlog(n))
            SC = O(log(n)) => No. of stack frames
         */

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the range want to sort : ");
        int l = sc.nextInt(); // Enter starting point 0
        int r = sc.nextInt(); // Enter ending point n-1

        mergeSort(arr,l,r);   // Ranges from 0 to n-1

        System.out.println("Array after sorting : ");
        printArray(arr);

    }
}
