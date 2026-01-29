package Arrays.ArrayTwoPointer;

import java.util.Scanner;
public class ReturnArrayOfSquareInDecreasingOrder {
    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int arr[] , int left , int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static void reverse(int arr[]){
        int n = arr.length;
        int i = 0 , j = n-1;
        while (j>i){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static int[] sortSquares(int arr[]){
        int n = arr.length;
        int left = 0 , right = n-1;
        int ans[] = new int[n];
        int k=0;
        while (left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
//    public static void squareAndSort(int arr[]){
//        int n = arr.length;
//        for(int i=0 ; i<n ; i++){
//            arr[i] = arr[i]*arr[i];
//        }
//
//        for(int i=0 ; i<n ; i++){
//            for(int j=i+1 ; j<n ; j++){
//                if(arr[i]>arr[j]){
//                    swap(arr,i,j);
//                }
//            }
//        }
//    }

//    public static void squareAndSortEvenFirstAndOddLast(int arr[]){
//        int n = arr.length;
//        for(int i=0 ; i<n ; i++){
//            arr[i] = arr[i] * arr[i];
//        }
//        int left=0 , right=n-1;
//        while (right>left){
//            if(arr[left]%2!=0 && arr[right]%2==0){
//                swap(arr,left,right);
//                left++;
//                right--;
//            }
//            if(arr[left]%2==0) left++;
//            if(arr[right]%2!=0) right--;
//        }
//    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Q. Given an integer array arr[] sorted in non-decreasing(increasing)
        order,return an array of the squares of each number sorted in
        non-decreasing(increasing) order.
         */

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" element in array : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int ans[] = sortSquares(arr);
        reverse(ans);
        System.out.println("Sorted array : ");
        printArray(ans);

    }
}
