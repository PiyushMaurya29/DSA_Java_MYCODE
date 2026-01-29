package Arrays_and_ArrayList;

import java.util.Arrays;

public class ReverseArray {
    static void swap(int arr[] , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static void reverseArray(int arr[]){
        // This is two pointer method
        int start = 0 , end = arr.length-1;
        while (end>start){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {

        int arr[] = {23,45,67,88,11,74};

        System.out.println(Arrays.toString(arr));

        reverseArray(arr);

        System.out.println(Arrays.toString(arr));

    }
}
