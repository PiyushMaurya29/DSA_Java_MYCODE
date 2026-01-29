package Arrays.Array_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Kth_SmallestANDLargest {
    public static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void findKthSmallest(int arr[] , int k){
        Arrays.sort(arr);
        System.out.println("Sorted Array : ");
        printArray(arr);
        System.out.println("Kth smallest element : "+arr[k-1]);
        System.out.println("Kth largest element : "+arr[arr.length-k]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of K : ");
        int k = sc.nextInt();

        findKthSmallest(arr , k);

    }
}
