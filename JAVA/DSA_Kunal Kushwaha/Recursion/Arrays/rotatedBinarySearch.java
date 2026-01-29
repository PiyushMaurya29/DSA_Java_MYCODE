package Recursion.Arrays;

public class rotatedBinarySearch {
    public static int rotatedBS(int arr[], int s, int e, int key){
        int mid = s + (e - s) / 2;
        if(s > e) return -1;
        if(key == arr[mid]) return mid;
        if(arr[mid] > arr[s]){
            if(key >= arr[s] && key < arr[mid]) return rotatedBS(arr, s, mid-1, key);
            else return rotatedBS(arr, mid+1, e, key);
        }
        else{
            if(key > arr[mid] && key <= arr[e]) return rotatedBS(arr, mid+1, e, key);
            else return rotatedBS(arr, s, mid-1, key);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(rotatedBS(arr, 0, arr.length-1, 1));
    }
}
