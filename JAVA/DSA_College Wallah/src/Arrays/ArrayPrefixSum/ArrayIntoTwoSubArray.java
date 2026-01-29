package Arrays.ArrayPrefixSum;
import java.util.Scanner;
public class ArrayIntoTwoSubArray {
    public static void printArray(int arr[]){
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int findArraySum(int arr[]){
        int n = arr.length;
        int totalSum = 0;
        for(int i=0 ; i<n ; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }
    public static boolean equalSumPartition(int arr[]){
        int n = arr.length;

        int totalSum = findArraySum(arr);
        int prefixSum = 0;
        for(int i=0 ; i<n ; i++){
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if(suffixSum==prefixSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Check if we can partition the array into two subArrays with
         equal sum . More formally , check that the prefix sum of a part of
         the array is equal to the suffix sum of rest of the array.
         Note : Prefix sum is taken from left to right
                Suffix sum is taken from right to left
         */

        /* Logic : arr : 5 3 2 6 3 1
                prefix : 5 8 10 16 19 20
                suffix : 20 15 12 10 4 1

                If prefix[i] = suffix[i+1] True otherwise False

         */

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        //        int arr[] = {1,3,5,6,2,1};
        System.out.println("Enter "+n+" elements of array : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Equal Partition possible : "+equalSumPartition(arr));
    }
}
