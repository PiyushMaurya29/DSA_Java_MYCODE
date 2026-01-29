package BinarySearch;

import java.util.Arrays;

public class _4_FirstAndLast_Occurrence {
    static int findFirstOccurrence(int arr[], int key){
        int n = arr.length;
        int s=0, e=n-1;
        int firstOccurrence = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(key == arr[mid]){
                firstOccurrence = mid;
                e = mid - 1;
            }
            else if(key < arr[mid]) e = mid - 1;
            else s = mid + 1;
        }
        return firstOccurrence;
    }
    static int findLastOccurrence(int arr[], int key){
        int n = arr.length;
        int s=0, e=n-1;
        int lastOccurrence = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(key == arr[mid]){
                lastOccurrence = mid;
                s = mid + 1;
            }
            else if(key > arr[mid]) s = mid + 1;
            else e = mid - 1;
        }
        return lastOccurrence;
    }
    static int[] findFirstAndLast_Occurrence(int arr[], int key){
        return new int[] {findFirstOccurrence(arr,key), findLastOccurrence(arr, key)};
    }
    public static void main(String[] args) {
        int arr[] = {2,4,10,10,10,18,20};

        System.out.println(findFirstOccurrence(arr, 10));
        System.out.println(findLastOccurrence(arr, 10));

        int ans[] = findFirstAndLast_Occurrence(arr,10);

        System.out.println(Arrays.toString(ans));
    }
}
